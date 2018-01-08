package crypto.thing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TreeSet;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;

import org.apache.http.client.ClientProtocolException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HistoryAnalyzer 
{
	
	public HistoryAnalyzer()
	{
		
	}

	public void process() throws ClientProtocolException, IOException
	{
		String content = new String(Files.readAllBytes(Paths.get(AaayyConstantsEditMe.UNIFIED_HISTORY_LOCATION)));
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(AaayyConstantsEditMe.SALES_ANALYSIS_CSV_LOCATION,false)); // false = do not append.
	    writer.write(""); // blank out the existing output file.
	    writer.close();
	    writer = new BufferedWriter(new FileWriter(AaayyConstantsEditMe.SALES_ANALYSIS_CSV_LOCATION, true)); // true = append
		
		ObjectMapper mapper = new ObjectMapper();
		Set<Commonentry> commonentries = mapper.readValue(content, new TypeReference<TreeSet<Commonentry>>(){});
		
		Commonentry commonentry = new Commonentry();
		DateFormat easternDateFormat = new SimpleDateFormat("yyyy-MM-dd"); // poloniex timestamps formatted like: 2017-09-16 20:12:29
		easternDateFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		StringBuilder sb = new StringBuilder();
		Formatter formatter = new Formatter(sb, Locale.US);
		
		Map<String,Queue<Chunk>> chunksMap = new HashMap<String,Queue<Chunk>>();
		
		Iterator<Commonentry> commonentries_it = commonentries.iterator();
		String toUnits;
		Queue<Chunk> chunkQueue0;
		Chunk chunk = new Chunk();
		Chunk chunkForTermCalculation = new Chunk();
		while(commonentries_it.hasNext())
		{
			commonentry = commonentries_it.next();
			toUnits = commonentry.getToUnits();
			
			if(toUnits.equals("USD")) 
			{
				// USD is the only demonination for which we do not track chunks. These are all final sales.
			}
			else
			{
				chunk = new Chunk();
				chunk.setTimestamp(commonentry.getTimestamp());
				chunk.setTimestampHr(commonentry.getTimestampHr());
				chunk.setUnits(toUnits);
				chunk.setCostBasisPerUnit(commonentry.getCostBasisPerUnit());
				chunk.setQuantity(commonentry.getToAmount());
				if(chunksMap.containsKey(toUnits)) // this will also do USD which (I think) we'll ignore later.
				{
					chunkQueue0 = chunksMap.get(toUnits);
					chunkQueue0.add(chunk);
					
				}
				else
				{
					chunkQueue0 = new PriorityQueue<Chunk>();
					chunkQueue0.add(chunk);
					chunksMap.put(toUnits, chunkQueue0);
//					System.out.println("Added toUnits="+ toUnits);
				}
			}
		}
		
		Set<String> symbols = chunksMap.keySet();
		Map<String,Double> totalsMap = new TreeMap<String,Double>();
		Iterator<String> symbols_it = symbols.iterator();
		String currentsymbol = "";
		while(symbols_it.hasNext())
		{
			currentsymbol = symbols_it.next();
			totalsMap.put(currentsymbol + " ST", new Double(0));
			totalsMap.put(currentsymbol + " LT", new Double(0));
			totalsMap.put(currentsymbol + " TOTAL", new Double(0));
		}
		
		commonentries_it = commonentries.iterator();
		int count = 0;
		int limit = 50000;
		long timegap = 0L;
		double valchange = 0;
		boolean stayOnCurrentSell = false; // if an old chunk is not sufficient to cover this sell, we use up the chunk, but keep what's left of the sell for further processing
		double timegapInDays = 0.0;
		String longOrShort = "";
		String gainLoss = "";
		double gainLossAmount = 0.0;
		String sufficiency = "";
		final String formatterString = "%1$15s,%2$18.8f,%3$4s,%4$18.8f,%5$4s,at,%6$15.8f,per share. Using,%7$13s,chunk,%8$20.8f,%9$4s,acquired at,%10$10.2f,per share,%11$6s,days,%12$10s,%13$4s,%14$10.2f, USD, %15$10s, "; // %15$13s, %3$4s,LT,%16$13s,%3$4s,ST, %17$13s,total
		
		double stRunningTotal = 0;
		double ltRunningTotal = 0;
		
		long oneone2009 = 1230768000000L;
		long aYearInMillis = 31540000000L;
		int yearCounter = 0;
		int yearLimit = 100; // seems like enough... robots should kill us all way before this.
		Map<String, Double> yearlyTotalsMap = new TreeMap<String, Double>();
		
		
		double difference = 0;
		boolean pollTheChunk = false;
		while(commonentries_it.hasNext() && count < limit)
		{
			if(!stayOnCurrentSell)
				commonentry = commonentries_it.next();
			else
			{	
				stayOnCurrentSell = false;
			}
			
				if(commonentry.getFromUnits().equals("USD"))
				{
					// skip. "selling" USD is the only one we ignore.
				}
				else
				{
//					System.out.println(commonentry.getTimestampHr() + " SALE:\t" + commonentry.getFromAmount() + " " + commonentry.getFromUnits() + "\tts=" + commonentry.getTimestamp() + "\tval=" + (commonentry.getUsdTotal()/commonentry.getFromAmount()));
					Queue<Chunk> chunkQueue1 = chunksMap.get(commonentry.getFromUnits());
					
					if(chunkQueue1 == null) // note: empty is fine. Means all buys accounted for.
					{
						System.err.println("While analyzing the history, we found a sale of a symbol (" + commonentry.getFromUnits() + ") not found in the buy history. Please account for this sale in the HistoryAssembler and retry. Cannot continue.");
						System.exit(1);
					}
					else
					{	
						Iterator<Chunk> chunks_it1;
						chunks_it1 = chunkQueue1.iterator();
						pollTheChunk = false;
						if(chunks_it1.hasNext())
						{
							chunk = chunks_it1.next();
							if(chunk.getUnits().equals(commonentry.getFromUnits()))
							{	
								valchange = (commonentry.getUsdTotal()/commonentry.getFromAmount()) - chunk.getCostBasisPerUnit();
								timegap = (commonentry.getTimestamp() - chunk.getTimestamp());
								timegapInDays = (timegap / 1000 / 60 / 60 / 24);
								if (timegap >= 31540000000L)
									longOrShort = "LONG TERM";
								else
									longOrShort = "SHORT TERM";
								
								difference = chunk.getQuantity() - commonentry.getFromAmount();
								if (difference < .0001 && difference > -.0001)
								{
									if(valchange < 0)
										gainLoss = "LOSS";
									else
										gainLoss = "GAIN";
									gainLossAmount = valchange*commonentry.getFromAmount();
									sufficiency = "EXACT";
									pollTheChunk = true; // the early buy has been used up.
								}
								else if (difference > 0)
								{
									if(valchange < 0)
										gainLoss = "LOSS";
									else
										gainLoss = "GAIN";
									gainLossAmount = valchange*commonentry.getFromAmount();
									sufficiency = "SUFFICIENT";
									// don't poll the chunk it has some left.
								}
								else
								{
									if(valchange < 0)
										gainLoss = "LOSS";
									else
										gainLoss = "GAIN";
									gainLossAmount = valchange*chunk.getQuantity();
									sufficiency = "INSUFFICIENT";
									
									pollTheChunk = true; // the early buy has been used up.
									
									// the current sell was not entirely accounted for. Keep it for next iteration. (note, it will be reduced below after printing the first half of the line.
									stayOnCurrentSell = true;
								}
							}
						}
						
						String outputString = formatter.format(formatterString,
								commonentry.getTimestampHr(), 
								commonentry.getFromAmount(),   		
								commonentry.getFromUnits(), 
								commonentry.getToAmount(),  
								commonentry.getToUnits(), 
								commonentry.getUsdTotal()/commonentry.getFromAmount(), 
								sufficiency, 
								chunk.getQuantity(),
								chunk.getUnits(),
								chunk.getCostBasisPerUnit(),
								timegapInDays,
								longOrShort,
								gainLoss,
								gainLossAmount,
								commonentry.getExchangeName()
								).toString();
						System.out.print(outputString); 
						writer.append(outputString);
//						Files.write(Paths.get(AaayyConstantsEditMe.SALES_ANALYSIS_CSV_LOCATION), outputString.getBytes());
						sb.setLength(0);
						
						// change quantities
						
						if(pollTheChunk)
							chunkQueue1.poll(); // it was used up
						else
							chunk.setQuantity(chunk.getQuantity() - commonentry.getFromAmount()); // there is still some left
						
						if(stayOnCurrentSell)
						{
							double remainderNative = commonentry.getFromAmount() - chunk.getQuantity();
							double percentLeft = (commonentry.getFromAmount() - chunk.getQuantity())/commonentry.getFromAmount();
							commonentry.setBtcAmount(commonentry.getBtcAmount() * percentLeft);
							commonentry.setUsdTotal(commonentry.getUsdTotal() * percentLeft);
							commonentry.setFromAmount(remainderNative);
							commonentry.setToAmount(commonentry.getToAmount() * percentLeft);
						}
						
						// now loop through the remaining chunks and calculate LT and ST totals for each coin we're tracking.
						chunks_it1 = chunkQueue1.iterator(); // this is only the chunks of the same type as the sale.
						stRunningTotal = 0;
						ltRunningTotal = 0;
						while(chunks_it1.hasNext())
						{
							chunkForTermCalculation = chunks_it1.next();
									
							if(chunkForTermCalculation.getTimestamp() < commonentry.getTimestamp()) 						// we only care about the chunks (still remaining) acquired before this sale. If there are none, we shouldn't be in this loop.
							{	
								if((commonentry.getTimestamp() - chunkForTermCalculation.getTimestamp()) >= 31540000000L)	// this chunk (still remaining), acquired before this sale is more than a year old.
								{
									ltRunningTotal = ltRunningTotal + chunkForTermCalculation.getQuantity();
								}
								else 																						// this chunk (still remaining), acquired before this sale is less than a year old.
								{
									stRunningTotal = stRunningTotal + chunkForTermCalculation.getQuantity();
								}
							}
						}
						
						// Maybe make zero if very close here?
						
						totalsMap.put(commonentry.getFromUnits() + " ST", stRunningTotal);
						totalsMap.put(commonentry.getFromUnits() + " LT",  ltRunningTotal);
						totalsMap.put(commonentry.getFromUnits() + " TOTAL",  ltRunningTotal + stRunningTotal);
						
						// now that we've calculated the ST/LT running totals for each coin, print them on the same line.
						
						Iterator<String> totalsKeys_it = totalsMap.keySet().iterator();
						String currentTotalKey = "";
						while(totalsKeys_it.hasNext())
						{
							currentTotalKey = totalsKeys_it.next();
							
							outputString = formatter.format("%1$18.8f,%2$4s,",
									totalsMap.get(currentTotalKey), 
									currentTotalKey).toString();
							System.out.print(outputString); 
							writer.append(outputString);
							sb.setLength(0);
						}
						System.out.println(); 
						writer.append(System.lineSeparator());
						
						if(commonentry.getTimestamp() < oneone2009)
						{
							// before 2009, uh... before the BTC genesis block?
						}
						else
						{
							yearCounter = 0;
							Double currentDouble = new Double(0);
							while(yearCounter < yearLimit)
							{
								if(((yearCounter * aYearInMillis) + oneone2009) < commonentry.getTimestamp() && commonentry.getTimestamp() < (((yearCounter+1) * aYearInMillis) + oneone2009))
								{
									if(longOrShort.toLowerCase().startsWith("short"))
									{
										currentDouble = yearlyTotalsMap.get((2009 + yearCounter) + "shortTerm");
										if(currentDouble == null)
											currentDouble = new Double(0);
										yearlyTotalsMap.put((2009 + yearCounter) + "shortTerm", currentDouble + gainLossAmount);
									}
									else
									{
										currentDouble = yearlyTotalsMap.get((2009 + yearCounter) + "longTerm");
										if(currentDouble == null)
											currentDouble = new Double(0);
										yearlyTotalsMap.put((2009 + yearCounter) + "longTerm", currentDouble + gainLossAmount);
									}
								}
								yearCounter++;
							}
						}
					}
				}
			count++;
		}
		
		for (Map.Entry<String, Double> entry : yearlyTotalsMap.entrySet()) {
		    System.out.println(entry.getKey() + ":" + entry.getValue().toString());
		}
		
		formatter.close();
		writer.close();
	}
	
    public static void main( String[] args )
    {
        HistoryAnalyzer myApp = new HistoryAnalyzer();
        try {
			myApp.process();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}