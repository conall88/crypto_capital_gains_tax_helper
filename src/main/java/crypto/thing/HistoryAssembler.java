/* 
 * Copyright 2018 Cyrus Adkisson

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, 
including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package crypto.thing;

/***
 *     _   _ _____ _____ _   _ _____ _   _ _____   _   _  ___________ _____ _____ _   _   _____ _   _ _____ _   _ _    ______ 
 *    | \ | |  _  |_   _| | | |_   _| \ | |  __ \ | | | ||  ___| ___ \  ___|_   _| \ | | /  ___| | | |  _  | | | | |   |  _  \
 *    |  \| | | | | | | | |_| | | | |  \| | |  \/ | |_| || |__ | |_/ / |__   | | |  \| | \ `--.| |_| | | | | | | | |   | | | |
 *    | . ` | | | | | | |  _  | | | | . ` | | __  |  _  ||  __||    /|  __|  | | | . ` |  `--. \  _  | | | | | | | |   | | | |
 *    | |\  \ \_/ / | | | | | |_| |_| |\  | |_\ \ | | | || |___| |\ \| |___ _| |_| |\  | /\__/ / | | \ \_/ / |_| | |___| |/ / 
 *    \_| \_/\___/  \_/ \_| |_/\___/\_| \_/\____/ \_| |_/\____/\_| \_\____/ \___/\_| \_/ \____/\_| |_/\___/ \___/\_____/___/  
 *                                                                                                                            
 *                                                                                                                            
 *    ______ _____   _____ _____ _   _  _____ ___________ ___________ ___________                                             
 *    | ___ \  ___| /  __ \  _  | \ | |/  ___|_   _|  _  \  ___| ___ \  ___|  _  \                                            
 *    | |_/ / |__   | /  \/ | | |  \| |\ `--.  | | | | | | |__ | |_/ / |__ | | | |                                            
 *    | ___ \  __|  | |   | | | | . ` | `--. \ | | | | | |  __||    /|  __|| | | |                                            
 *    | |_/ / |___  | \__/\ \_/ / |\  |/\__/ /_| |_| |/ /| |___| |\ \| |___| |/ /                                             
 *    \____/\____/   \____/\___/\_| \_/\____/ \___/|___/ \____/\_| \_\____/|___/                                              
 *                                                                                                                            
 *                                                                                                                            
 *     _      _____ _____   ___   _        ___ ______ _   _ _____ _____  _____                                                
 *    | |    |  ___|  __ \ / _ \ | |      / _ \|  _  \ | | |_   _/  __ \|  ___|                                               
 *    | |    | |__ | |  \// /_\ \| |     / /_\ \ | | | | | | | | | /  \/| |__                                                 
 *    | |    |  __|| | __ |  _  || |     |  _  | | | | | | | | | | |    |  __|                                                
 *    | |____| |___| |_\ \| | | || |____ | | | | |/ /\ \_/ /_| |_| \__/\| |___                                                
 *    \_____/\____/ \____/\_| |_/\_____/ \_| |_/___/  \___/ \___/ \____/\____/                                                
 *                                                                                                                            
 *                                                                                                                            
 *     _   _ _____ _____    ___ _____   _____  _    _ _   _  ______ _____ _____ _   __                                        
 *    | | | /  ___|  ___|  / _ \_   _| |  _  || |  | | \ | | | ___ \_   _/  ___| | / /                                        
 *    | | | \ `--.| |__   / /_\ \| |   | | | || |  | |  \| | | |_/ / | | \ `--.| |/ /                                         
 *    | | | |`--. \  __|  |  _  || |   | | | || |/\| | . ` | |    /  | |  `--. \    \                                         
 *    | |_| /\__/ / |___  | | | || |   \ \_/ /\  /\  / |\  | | |\ \ _| |_/\__/ / |\  \                                        
 *     \___/\____/\____/  \_| |_/\_/    \___/  \/  \/\_| \_/ \_| \_|\___/\____/\_| \_/                                        
 *                                                                                                                            
 *                                                                                                                            
 *     _   _ _____   _____ _   _  ___  ______  ___   _   _ _____ _____ _____ _____                                            
 *    | \ | |  _  | |  __ \ | | |/ _ \ | ___ \/ _ \ | \ | |_   _|  ___|  ___/  ___|                                           
 *    |  \| | | | | | |  \/ | | / /_\ \| |_/ / /_\ \|  \| | | | | |__ | |__ \ `--.                                            
 *    | . ` | | | | | | __| | | |  _  ||    /|  _  || . ` | | | |  __||  __| `--. \                                           
 *    | |\  \ \_/ / | |_\ \ |_| | | | || |\ \| | | || |\  | | | | |___| |___/\__/ /                                           
 *    \_| \_/\___/   \____/\___/\_| |_/\_| \_\_| |_/\_| \_/ \_/ \____/\____/\____/                                            
 *                                                                                                                            
 *    Nothing herein should be considered legal advice. Use at own risk. No guarantees.                                                                                                                   
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

// see README.md for background on what this repository and program are and how to use them.

public class HistoryAssembler 
{
	// NOTE: From what I could tell, the oldest GDAX BTC historical data is:
	// https://api.gdax.com/products/BTC-USD/candles?start=2015-01-26T03:01:00-04:00&end=2015-01-26T03:02:00-04:00
	// Response: [[1422255660,284.25,290.08,284.25,286.09,99.75459999999995]]
	// This is fine for me because all of my crypto transactions before this date are from BTC to USD or reverse which means I know the price then.
	// ***
	// *** IF YOU HAVE CRYPTO TRANSACTIONS BEFORE 2015-01-26 THAT AREN'T BTC→USD or USD→BTC, then you'll need to reconfigure this to use a different API for BTC price determination
	// *** Alternatively, if you have just a few before this date, you can create the entries manually.
	
	private GdaxHelper gdaxHelper;
	private PoloniexHelper poloniexHelper;
	
	private boolean includeSpecial = false; // do you have non-exchange things you need to include. Set this to true and add them below.
	private boolean excludeSpecial = false; // do you have exchange-based transactions you need to exclude for whatever reason? Set this to true and add the exclusion logic below
	
	public HistoryAssembler()
	{
		gdaxHelper = new GdaxHelper();
		poloniexHelper = new PoloniexHelper();
	}
	
	public void process() throws ClientProtocolException, IOException
	{
		ObjectMapper mapper = new ObjectMapper(); // this is the Jackson utility that changes Java POJOs into JSON (and vice versa)
		
		// First, to prevent pinging APIs multiple times for the same data, this program will save USD/BTC and BTC/ETH ticks to a couple of files. 
		// If we've run this program previously, load the information from those files here.
		
		Map<Long,Double> knownUsdPerBtcTicks = new HashMap<Long,Double>();
		Path knownUsdPerBtcTicksPath = Paths.get(AaayyConstantsEditMe.KNOWN_USD_PER_BTC_TICKS_LOCATION);
		if(Files.isRegularFile(knownUsdPerBtcTicksPath)) {
			String knownUsdPerBtcTicksContent = new String(Files.readAllBytes(knownUsdPerBtcTicksPath));
			knownUsdPerBtcTicks = mapper.readValue(knownUsdPerBtcTicksContent, new TypeReference<HashMap<Long,Double>>(){});
		}
		
		Map<Long,Double> knownBtcPerEthTicks = new HashMap<Long,Double>(); 				// need this for Polo trades not involving BTC
		Path knownBtcPerEthTicksPath = Paths.get(AaayyConstantsEditMe.KNOWN_BTC_PER_ETH_TICKS_LOCATION);
		if(Files.isRegularFile(knownBtcPerEthTicksPath)) {
			String knownBtcPerEthTicksContent = new String(Files.readAllBytes(knownBtcPerEthTicksPath));
			knownBtcPerEthTicks = mapper.readValue(knownBtcPerEthTicksContent, new TypeReference<HashMap<Long,Double>>(){});
		}
		
		DateFormat outDf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a z"); 	// Set the timestamp format
		outDf.setTimeZone(TimeZone.getTimeZone("America/New_York"));			// and time zone for the output file. If you prefer something else, change this.
		
		TreeSet<Commonentry> commonentries = new TreeSet<Commonentry>();				// We are going to assemble a unified Set of trade history of the type "Commonentry". These will auto-sort by date from oldest (top) to newest (bottom). 
		
		// Wouldn't it be great to just download exchange information, click "go" and have everything taken care of neatly??? 
		// Well unfortunately there are usually exceptions. And if you have any of these (or others), you'll need to adjust accordingly. 
		
		Commonentry entry = new Commonentry();	
		if(includeSpecial)
		{
			// ETHERSALE PURCHASE
			// Using .25 Eth I'd purchased on coinbase, I bought a small spot of Ethereum in the ether sale. This isn't captured anywhere else, so this is the manual entry.
			entry.setTimestamp(1407970263000L);										// use an online timestamp to epoch converter to get this number.
			entry.setTimestampHr(outDf.format(new Date(entry.getTimestamp())));
			entry.setFromUnits("BTC");												// Ethersale took BTC...
			entry.setToUnits("ETH");												// and gave ETH.
			entry.setFromAmount(0.25); 												// I exchanged 0.25 BTC
			entry.setToAmount(432.5);												// for 432.5 ETH
			entry.setToPerFrom(entry.getFromAmount()/entry.getToAmount());// 432.5/.25 = 1730 ETH per BTC -- I was late. :(
			entry.setExchangeName("ethersale");										
			entry.setBtcAmount(0.25); 												// Every Commonentry wants to know the BTC equivalent of this transaction, in order to get to a USD value. Since the "from" of this one was BTC, we already know it.
			entry.setBtcPriceInUsd(550);											// I have my own records that I spent $137.50 in my Ethersale purchase, so that times 4 = $550 BTC at the time. Could use Polo BTC-USDT for this. Too early for GDAX data.
			entry.setUsdTotal(137.5);												// From my own records. 
			entry.setUsdDerivationMethod("manual");									
			entry.setBtcDerivationMethod("manual");
			entry.setFeeInUsd(0.0);													// Paid no fees on this.
			entry.setCostBasisPerUnit(entry.getUsdTotal()/entry.getToAmount());		// The USD value divided by how many of the "to" units we got from it = the cost basis.
			commonentries.add(entry);												// Add it to the list.
			
			// IN-PERSON BTC BUY 
			// Bought a bit of BTC from a guy in person. Email record: "Goog says 2 BTC = $530.70. Is $540 ok?" // Aug 13, '15 (2 years 4 months ago) // "I should be down at TNL around 8." (EST)
			entry = new Commonentry();
			entry.setTimestamp(1439510400000L);										// 8pm EST on 8/13/2015
			entry.setTimestampHr(outDf.format(new Date(entry.getTimestamp())));		
			entry.setFromUnits("USD");
			entry.setToUnits("BTC");
			entry.setFromAmount(530.70);
			entry.setToAmount(2);
			entry.setToPerFrom(entry.getFromAmount()/entry.getToAmount());
			entry.setExchangeName("human");
			entry.setBtcAmount(2); 
			entry.setBtcPriceInUsd(530.70/2);
			entry.setUsdTotal(530.70);
			entry.setUsdDerivationMethod("manual");
			entry.setBtcDerivationMethod("manual");
			entry.setFeeInUsd(9.30);												// From the email.
			entry.setCostBasisPerUnit(entry.getUsdTotal()/entry.getToAmount());
			commonentries.add(entry);
	
			// INCOME 	
			// 2015/9/2 	nanopool 	16.2387 // 	https://api.gdax.com/products/BTC-USD/candles?start=2015-09-02T03:01:00-04:00&end=2015-09-02T03:02:00-04:00    			// 228.18
			// 									//	https://poloniex.com/public?command=returnChartData&currencyPair=BTC_ETH&start=1441166400&end=1441186400&period=14400   // 0.00574
			//									//	1 eth = $1.3097532
			entry = new Commonentry();
			entry.setTimestamp(1441166400000L);
			entry.setTimestampHr(outDf.format(new Date(entry.getTimestamp())));
			entry.setFromUnits("USD");
			entry.setToUnits("ETH");
			entry.setFromAmount(21.2686892888);										// For an acquisition as income, I'm treating it like a USD purchase at the current price. Not sure this is good, but fine for the purposes of calculating capital gains.
			entry.setToAmount(16.2387);
			entry.setToPerFrom(entry.getFromAmount()/entry.getToAmount());
			entry.setExchangeName("nanopool mining");
			entry.setBtcAmount(0.093210138/228.18); 
			entry.setBtcPriceInUsd(228.18);
			entry.setBtcDerivationMethod("GDAX BTC-USD");
			entry.setUsdTotal(21.2686892888);										 
			entry.setUsdDerivationMethod("GDAX BTC-USD + Polo BTC_ETH");
			entry.setFeeInUsd(0.0);													// There was probably a fee to the pool, but I ignore that here. Miniscule.
			entry.setCostBasisPerUnit(entry.getUsdTotal()/entry.getToAmount());
			entry.setIncome(true); 													// when income = true, this means I didn't actually "pay" USD for it. The From units and amount as USD is derived.									
			commonentries.add(entry);
			
			// 2015/9/17 	solomining	112.566068 	// https://api.gdax.com/products/BTC-USD/candles?start=2015-09-17T03:01:00-04:00&end=2015-09-17T03:02:00-04:00  [[1442473260,229.97,230.05,229.97,230.05,4.260009999999999]]
			//										// https://poloniex.com/public?command=returnChartData&currencyPair=BTC_ETH&start=1442462400&end=1442472400&period=14400    0.003841
			//										// 1 eth = $0.88362205
			entry = new Commonentry();
			entry.setTimestamp(1442462400000L);
			entry.setTimestampHr(outDf.format(new Date(entry.getTimestamp())));
			entry.setFromUnits("USD");
			entry.setToUnits("ETH");
			entry.setFromAmount(0.88362205 * 112.566068);
			entry.setToAmount(112.566068);
			entry.setToPerFrom(entry.getFromAmount()/entry.getToAmount());
			entry.setExchangeName("solo mining");
			entry.setBtcAmount((0.88362205 * 112.566068)/230.05); 
			entry.setBtcPriceInUsd(230.05);
			entry.setBtcDerivationMethod("GDAX BTC-USD");
			entry.setUsdTotal(0.88362205 * 112.566068);
			entry.setUsdDerivationMethod("GDAX BTC-USD + Polo BTC_ETH");
			entry.setFeeInUsd(0.0);
			entry.setCostBasisPerUnit(entry.getUsdTotal()/entry.getToAmount());
			entry.setIncome(true); 													
			commonentries.add(entry);
			
			// 2015/10/6	bounty		5	// https://api.gdax.com/products/BTC-USD/candles?start=2015-10-06T03:01:00-04:00&end=2015-10-06T03:02:00-04:00  				[[1444114860,241.36,241.36,241.36,241.36,0.05]]
			//								// https://poloniex.com/public?command=returnChartData&currencyPair=BTC_ETH&start=1444104000&end=1444114000&period=14400  		0.00252313
			//								// 1 eth = $0.6089826568	
			entry = new Commonentry();
			entry.setTimestamp(1444104000000L);
			entry.setTimestampHr(outDf.format(new Date(entry.getTimestamp())));
			entry.setFromUnits("USD");
			entry.setToUnits("ETH");
			entry.setFromAmount(0.6089826568 * 5);
			entry.setToAmount(5);
			entry.setToPerFrom(entry.getFromAmount()/entry.getToAmount());
			entry.setExchangeName("bounty");
			entry.setBtcAmount((0.6089826568 * 5)/241.36); 
			entry.setBtcPriceInUsd(241.36);
			entry.setBtcDerivationMethod("GDAX BTC-USD");
			entry.setUsdTotal(0.6089826568 * 5);
			entry.setUsdDerivationMethod("GDAX BTC-USD + Polo BTC_ETH");
			entry.setFeeInUsd(0.0);
			entry.setCostBasisPerUnit(entry.getUsdTotal()/entry.getToAmount());
			entry.setIncome(true); 													
			commonentries.add(entry);
			
			// 2015/10/13 	weipool		0.429088 	// https://api.gdax.com/products/BTC-USD/candles?start=2015-10-13T03:01:00-04:00&end=2015-10-13T03:02:00-04:00  [[1444719660,246.87,246.88,246.88,246.87,2.48]]
			//										// https://poloniex.com/public?command=returnChartData&currencyPair=BTC_ETH&start=1444104000&end=1444124000&period=14400     0.00254341	
			//										// 1 eth = $0.6278916267
			entry = new Commonentry();
			entry.setTimestamp(1444708800000L);
			entry.setTimestampHr(outDf.format(new Date(entry.getTimestamp())));
			entry.setFromUnits("USD");
			entry.setToUnits("ETH");
			entry.setFromAmount(0.6278916267 * 0.429088);
			entry.setToAmount(0.429088);
			entry.setToPerFrom(entry.getFromAmount()/entry.getToAmount());
			entry.setExchangeName("weipool mining");
			entry.setBtcAmount((0.6278916267 * 0.429088)/246.87); 
			entry.setBtcPriceInUsd(246.87);
			entry.setBtcDerivationMethod("GDAX BTC-USD");
			entry.setUsdTotal(0.6278916267 * 0.429088);
			entry.setUsdDerivationMethod("GDAX BTC-USD + Polo BTC_ETH");
			entry.setFeeInUsd(0.0);
			entry.setCostBasisPerUnit(entry.getUsdTotal()/entry.getToAmount());
			entry.setIncome(true); 
			commonentries.add(entry);
			
			// 2015/10/22 etheria income 2.0629511 	// https://api.gdax.com/products/BTC-USD/candles?start=2015-10-22T03:01:00-04:00&end=2015-10-22T03:02:00-04:00 [[1445497260,271.15,271.15,271.15,271.15,0.39062349]]
			//									   	// https://poloniex.com/public?command=returnChartData&currencyPair=BTC_ETH&start=1445486400&end=1445496400&period=14400          0.00159961
			//									  	// 1 eth = $0.4337342515
			// In fall 2015, I built a dapp which cost a bunch of ETH to make (network fees) but also made some income. The best I can tell, the total net gain in this general timeframe was 2.0629511.
			entry = new Commonentry();
			entry.setTimestamp(1445486400000L);
			entry.setTimestampHr(outDf.format(new Date(entry.getTimestamp())));
			entry.setFromUnits("USD");
			entry.setToUnits("ETH");
			entry.setFromAmount(0.4337342515 * 2.0629511);
			entry.setToAmount(2.0629511);
			entry.setToPerFrom(entry.getFromAmount()/entry.getToAmount());
			entry.setExchangeName("etheria");
			entry.setBtcAmount((0.4337342515 * 2.0629511)/271.15); 
			entry.setBtcPriceInUsd(271.15);
			entry.setBtcDerivationMethod("GDAX BTC-USD");
			entry.setUsdTotal(0.4337342515 * 2.0629511);
			entry.setUsdDerivationMethod("GDAX BTC-USD + Polo BTC_ETH");
			entry.setFeeInUsd(0.0);
			entry.setCostBasisPerUnit(entry.getUsdTotal()/entry.getToAmount());
			entry.setIncome(true); 
			commonentries.add(entry);
			
			// 2015/11/8	solomining	100.284955 	// https://api.gdax.com/products/BTC-USD/candles?start=2015-11-08T03:01:00-04:00&end=2015-11-08T03:02:00-04:00  [[1446966060,386.13,386.38,386.38,386.13,0.2379]]
			//	   									// https://poloniex.com/public?command=returnChartData&currencyPair=BTC_ETH&start=1446958800&end=1446988800&period=14400          0.00243099
			//									  	// 1 eth = $0.9386781687
			entry = new Commonentry();
			entry.setTimestamp(1446958800000L);
			entry.setTimestampHr(outDf.format(new Date(entry.getTimestamp())));
			entry.setFromUnits("USD");
			entry.setToUnits("ETH");
			entry.setFromAmount(0.9386781687 * 100.284955);
			entry.setToAmount(100.284955);
			entry.setToPerFrom(entry.getFromAmount()/entry.getToAmount());
			entry.setExchangeName("solo mining");
			entry.setBtcAmount((0.9386781687 * 100.284955)/386.13); 
			entry.setBtcPriceInUsd(386.13);
			entry.setBtcDerivationMethod("GDAX BTC-USD");
			entry.setUsdTotal(0.9386781687 * 100.284955);
			entry.setUsdDerivationMethod("GDAX BTC-USD + Polo BTC_ETH");
			entry.setFeeInUsd(0.0);
			entry.setIncome(true); 
			commonentries.add(entry);
		
			// 2016/1/3		solomining	5 		 	// https://api.gdax.com/products/BTC-USD/candles?start=2016-01-03T03:01:00-04:00&end=2016-01-03T03:02:00-04:00  [[1451804460,433.09,433.09,433.09,433.09,0.0297]]
			//										// https://poloniex.com/public?command=returnChartData&currencyPair=BTC_ETH&start=1451797200&end=1451817200&period=14400    0.00230003
			//										// 1 ETH = $0.9961199927
			entry = new Commonentry();
			entry.setTimestamp(1451797200000L);
			entry.setTimestampHr(outDf.format(new Date(entry.getTimestamp())));
			entry.setFromUnits("USD");
			entry.setToUnits("ETH");
			entry.setFromAmount(0.9961199927 * 5);
			entry.setToAmount(5);
			entry.setToPerFrom(entry.getFromAmount()/entry.getToAmount());
			entry.setExchangeName("solo mining");
			entry.setBtcAmount((0.9961199927 * 5)/433.09); 
			entry.setBtcPriceInUsd(433.09);
			entry.setBtcDerivationMethod("GDAX BTC-USD");
			entry.setUsdTotal(0.9961199927 * 5);
			entry.setUsdDerivationMethod("GDAX BTC-USD + Polo BTC_ETH");
			entry.setFeeInUsd(0.0);
			entry.setCostBasisPerUnit(entry.getUsdTotal()/entry.getToAmount());
			entry.setIncome(true); 
			commonentries.add(entry);
			
			// 2016/2/5		video bounty 50 		// https://api.gdax.com/products/BTC-USD/candles?start=2016-02-05T03:01:00-04:00&end=2016-02-05T03:02:00-04:00   [[1454655660,383,383.01,383.01,383,0.55626918]]
			//										// https://poloniex.com/public?command=returnChartData&currencyPair=BTC_ETH&start=1454648400&end=1454668400&period=14400      0.00641006
			//										// 1 ETH = $2.45505298
			entry = new Commonentry();
			entry.setTimestamp(1454648400000L);
			entry.setTimestampHr(outDf.format(new Date(entry.getTimestamp())));
			entry.setFromUnits("USD");
			entry.setToUnits("ETH");
			entry.setFromAmount(2.45505298 * 50);
			entry.setToAmount(50);
			entry.setToPerFrom(entry.getFromAmount()/entry.getToAmount());
			entry.setExchangeName("bounty");
			entry.setBtcAmount((2.45505298 * 50)/383); 
			entry.setBtcPriceInUsd(383);
			entry.setBtcDerivationMethod("GDAX BTC-USD");
			entry.setUsdTotal(2.45505298 * 50);
			entry.setUsdDerivationMethod("GDAX BTC-USD + Polo BTC_ETH");
			entry.setFeeInUsd(0.0);
			entry.setCostBasisPerUnit(entry.getUsdTotal()/entry.getToAmount());
			entry.setIncome(true); 
			commonentries.add(entry);
			
			// 2016/2/8     etheria		24 	// https://api.gdax.com/products/BTC-USD/candles?start=2016-02-08T03:01:00-04:00&end=2016-02-08T03:02:00-04:00    [[1454914860,379.15,379.15,379.15,379.15,1.35259]]
			//  							// https://poloniex.com/public?command=returnChartData&currencyPair=BTC_ETH&start=1454907600&end=1455007600&period=14400	0.00817522
			//								// 1 ETH = $3.099634663
			entry = new Commonentry();
			entry.setTimestamp(1454907600000L);
			entry.setTimestampHr(outDf.format(new Date(entry.getTimestamp())));
			entry.setFromUnits("USD");
			entry.setToUnits("ETH");
			entry.setFromAmount(3.099634663 * 24);
			entry.setToAmount(24);
			entry.setToPerFrom(entry.getFromAmount()/entry.getToAmount());
			entry.setExchangeName("etheria");
			entry.setBtcAmount((3.099634663 * 24)/379.15); 
			entry.setBtcPriceInUsd(379.15);
			entry.setBtcDerivationMethod("GDAX BTC-USD");
			entry.setUsdTotal(3.099634663 * 24);
			entry.setUsdDerivationMethod("GDAX BTC-USD + Polo BTC_ETH");
			entry.setFeeInUsd(0.0);
			entry.setCostBasisPerUnit(entry.getUsdTotal()/entry.getToAmount());
			entry.setIncome(true); 
			commonentries.add(entry);
			
			// 2016/5/25    etheria		1 	// https://api.gdax.com/products/BTC-USD/candles?start=2016-05-25T03:01:00-04:00&end=2016-05-25T03:02:00-04:00   [[1464159660,449.08,449.08,449.08,449.08,2.29147]]
			//								// https://poloniex.com/public?command=returnChartData&currencyPair=BTC_ETH&start=1464148800&end=1464158800&period=14400    0.02802011
			//								// 1 ETH = $12.5832709988
			entry = new Commonentry();
			entry.setTimestamp(1464148800000L);
			entry.setTimestampHr(outDf.format(new Date(entry.getTimestamp())));
			entry.setFromUnits("USD");
			entry.setToUnits("ETH");
			entry.setFromAmount(12.5832709988 * 1);
			entry.setToAmount(1);
			entry.setToPerFrom(entry.getFromAmount()/entry.getToAmount());
			entry.setExchangeName("etheria");
			entry.setBtcAmount((12.5832709988 * 1)/449.08); 
			entry.setBtcPriceInUsd(449.08);
			entry.setBtcDerivationMethod("GDAX BTC-USD");
			entry.setUsdTotal(12.5832709988 * 1);
			entry.setUsdDerivationMethod("GDAX BTC-USD + Polo BTC_ETH");
			entry.setFeeInUsd(0.0);
			entry.setCostBasisPerUnit(entry.getUsdTotal()/entry.getToAmount());
			entry.setIncome(true); 
			commonentries.add(entry);
			
			// 2016/12/16   sold to someone at work // -10.76716 (eth price was 7.43, received $80) // https://api.gdax.com/products/BTC-USD/candles?start=2016-12-16T03:01:00-04:00&end=2016-12-16T03:02:00-04:00  [[1481871660,780.51,780.86,780.51,780.86,0.11]]
			// 							
			entry = new Commonentry();
			entry.setTimestamp(1445918400000L);
			entry.setTimestampHr(outDf.format(new Date(entry.getTimestamp())));
			entry.setFromUnits("ETH");
			entry.setToUnits("USD");
			entry.setFromAmount(10.76716);
			entry.setToAmount(80);
			entry.setToPerFrom(entry.getFromAmount()/entry.getToAmount());
			entry.setExchangeName("ashley");
			entry.setBtcAmount(80/780.86); 
			entry.setBtcPriceInUsd(780.86);
			entry.setBtcDerivationMethod("GDAX BTC-USD");
			entry.setUsdTotal(80);
			entry.setUsdDerivationMethod("first-hand");
			entry.setFeeInUsd(0.0);
			commonentries.add(entry);
			
			// 2017/3/9		etheria		3	 	https://api.gdax.com/products/BTC-USD/candles?start=2017-03-09T03:01:00-04:00&end=2017-03-09T03:02:00-04:00    	[[1489042860,1174.99,1174.99,1174.99,1174.99,0.37757281]]
			//									https://api.gdax.com/products/ETH-USD/candles?start=2017-03-09T03:01:00-04:00&end=2017-03-09T03:02:00-04:00		[[1489042860,17.58,17.58,17.58,17.58,2.11417779]]
			entry = new Commonentry();
			entry.setTimestamp(1489035600000L);
			entry.setTimestampHr(outDf.format(new Date(entry.getTimestamp())));
			entry.setFromUnits("USD");
			entry.setToUnits("ETH");
			entry.setFromAmount(17.58 * 3);
			entry.setToAmount(3);
			entry.setToPerFrom(entry.getFromAmount()/entry.getToAmount());
			entry.setExchangeName("etheria");
			entry.setBtcAmount((17.58 * 3)/1174.99); 
			entry.setBtcPriceInUsd(1174.99);
			entry.setBtcDerivationMethod("GDAX BTC-USD");
			entry.setUsdTotal(17.58 * 3);
			entry.setUsdDerivationMethod("GDAX ETH-USD");
			entry.setFeeInUsd(0.0);
			entry.setCostBasisPerUnit(entry.getUsdTotal()/entry.getToAmount());
			entry.setIncome(true); 
			commonentries.add(entry);
			
			// 5/5/2016 DAO purchase from personal ETH account (from Etherscan)
			entry = new Commonentry();
			entry.setTimestamp(1462478006000L);
			entry.setTimestampHr(outDf.format(new Date(entry.getTimestamp())));
			entry.setFromUnits("ETH");
			entry.setToUnits("DAO");
			entry.setFromAmount(100);
			entry.setToAmount(10000);
			entry.setToPerFrom(entry.getToAmount()/entry.getFromAmount());
			entry.setExchangeName("smart contract");
			entry.setBtcPriceInUsd(449.06); // https://api.gdax.com/products/BTC-USD/candles?start=2016-05-05T13:45:27Z&end=2016-05-05T13:46:27Z
											// BTC vs ETH // 0.02195039 // https://poloniex.com/public?command=returnChartData&currencyPair=BTC_ETH&start=1462478006&end=1462488006&period=14400
			entry.setBtcAmount(100*0.02195039); 
			entry.setUsdTotal(entry.getBtcAmount() * entry.getBtcPriceInUsd());
			entry.setUsdDerivationMethod("GDAX BTC-USD + Polo BTC_ETH");
			entry.setBtcDerivationMethod("GDAX BTC-USD");
			entry.setFeeInUsd(0.0);
			commonentries.add(entry);
			
			
			// DAO/ETC hardfork
			/*
			 * There are a few ways to handle hard forks. 
			 * A tax attorney I know (AGAIN THIS IS NOT LEGAL ADVICE) said that he'd split the cost basis proportionally at the time of the fork...
			 * I found it safer/easier below to just create a new entry for the "new" tokens (ETC) and set the acquisition date as the time of the hard fork.
			 * I think an argument could be made that the acquisition date of these "new" tokens is the same as the original purchase before the hard fork which may make a difference in ST/LT determination.
			 */
			// > new Date(eth.getBlock(1920000).timestamp * 1000).toUTCString()
			// "Wed, 20 Jul 2016 13:20:40 UTC"
			// first ETC tick on POloniex was at Sunday, July 24, 2016 12:00:00 AM UTC
			// 		https://poloniex.com/public?command=returnChartData&currencyPair=BTC_ETC&start=1469020840&end=1469520840&period=14400
			//		{"date":1469332800,"high":0.01,"low":0.00010098,"open":0.00995001,"close":0.00194901,"volume":6797.50557119,"quoteVolume":4619078.535367,"weightedAverage":0.00147161}
			// GDAX BTC USD at the same time
			//		https://api.gdax.com/products/BTC-USD/candles?start=2016-07-24T00:00:00Z&end=2016-07-24T00:01:00Z
			//		[[1469318400,657.55,657.55,657.55,657.55,0.70187]]
			// 1 ETC = $0.9676571555 ?? (I guess... sold these almost immediately so it doesn't really matter)
			entry = new Commonentry();
			entry.setTimestamp(1469020840000L);
			entry.setTimestampHr(outDf.format(new Date(entry.getTimestamp())));
			entry.setFromUnits("USD");
			entry.setToUnits("ETC");
			entry.setFromAmount(0.9676571555 * 967.8078758);
			entry.setToAmount(967.8078758); // this is the same amount of (non-stuck) ETH I had at this time, too
			entry.setToPerFrom(entry.getToAmount()/entry.getFromAmount());
			entry.setExchangeName("hard fork");
			entry.setBtcPriceInUsd(657.55); // https://api.gdax.com/products/BTC-USD/candles?start=2016-07-20T13:20:27Z&end=2016-07-20T13:21:27Z
			entry.setBtcAmount((0.9676571555 * 967.8078758)/657.55); 
			entry.setUsdTotal(entry.getBtcAmount() * entry.getBtcPriceInUsd());
			entry.setUsdDerivationMethod("GDAX BTC-USD + Polo BTC_ETC");
			entry.setBtcDerivationMethod("GDAX BTC-USD");
			entry.setFeeInUsd(0.0);
			entry.setCostBasisPerUnit(entry.getUsdTotal()/entry.getToAmount());
			entry.setIncome(true); 													// the reason I set income to "true" here (admittedly weird) is to signify that no USD was actually "paid" for this. 
			commonentries.add(entry);
			
			// OMG Airdrop
			/*
			 * Treated this as simple income. I'm sure there are other ways to interpret it.
			 */
			// 379.21069274
			// first OMG tick on POloniex was at Wednesday, September 13, 2017 4:00:00 PM UTC
			// 		https://poloniex.com/public?command=returnChartData&currencyPair=BTC_OMG&start=1505322459&end=1505532459&period=14400      0.00274502
			// BTC-USD at same time 
			//		https://api.gdax.com/products/BTC-USD/candles?start=2017-09-13T05:07:27Z&end=2017-09-13T05:08:27Z	[1505279280,3993.53,3993.53,3993.53,3993.53,1.59385998]
			// 1 OMG = $10.9623197206
			entry = new Commonentry();
			entry.setTimestamp(1505322459000L); // 9/13/2017 -- happened earlier, but doesn't matter
			entry.setTimestampHr(outDf.format(new Date(entry.getTimestamp())));
			entry.setFromUnits("USD");
			entry.setToUnits("OMG");
			entry.setFromAmount(10.9623197206 * 379.21069274);
			entry.setToAmount(379.21069274);
			entry.setToPerFrom(entry.getToAmount()/entry.getFromAmount());
			entry.setExchangeName("airdrop");
			entry.setBtcPriceInUsd(3993.53); 
			entry.setBtcAmount((10.9623197206 * 379.21069274)/3993.53); 
			entry.setUsdTotal(entry.getBtcAmount() * entry.getBtcPriceInUsd());
			entry.setUsdDerivationMethod("GDAX BTC-USD + Polo BTC_OMG");
			entry.setBtcDerivationMethod("GDAX BTC-USD");
			entry.setFeeInUsd(0.0);
			entry.setCostBasisPerUnit(entry.getUsdTotal()/entry.getToAmount());
			entry.setIncome(true); 
			commonentries.add(entry);
		}
		
		System.out.print("Saving history to " + AaayyConstantsEditMe.UNIFIED_HISTORY_LOCATION);
		try {
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			mapper.writeValue(new File(AaayyConstantsEditMe.UNIFIED_HISTORY_LOCATION), commonentries);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("...done.");
		
		Pattern pattern = Pattern.compile(",");											// When reading the exchange files, we need to separate by "," and the syntax requires this pattern.

		/***
		 *     _____ _____ _____ _   _ ______  ___   _____ _____ 
		 *    /  __ \  _  |_   _| \ | || ___ \/ _ \ /  ___|  ___| 
		 *    | /  \/ | | | | | |  \| || |_/ / /_\ \\ `--.| |__   
		 *    | |   | | | | | | | . ` || ___ \  _  | `--. \  __| 
		 *    | \__/\ \_/ /_| |_| |\  || |_/ / | | |/\__/ / |___ 
		 *     \____/\___/ \___/\_| \_/\____/\_| |_/\____/\____/  
		 *                                                                           
		 */
		
		DateFormat coinbaseDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z"); // coinbase timestamps formatted like: 2014-03-07 06:39:03 -0800
		Coinbaseentry coinbaseentry = null;
		
		Map<String,List<Coinbaseentry>> coinbaseMap = new HashMap<String,List<Coinbaseentry>>();
		
		String utc_timestamp = null;
		Date d = null;
		long ms_timestamp = 0;
		int symbolIndex = 0;
		while(symbolIndex < AaayyConstantsEditMe.COINBASE_SYMBOLS.length) // initialize the map with empty ArrayLists
		{
			coinbaseMap.put(AaayyConstantsEditMe.COINBASE_SYMBOLS[symbolIndex], new ArrayList<Coinbaseentry>());
			symbolIndex++;
		}
		symbolIndex = 0;
		List<Coinbaseentry> coinbaseEntries;
		while(symbolIndex < AaayyConstantsEditMe.COINBASE_SYMBOLS.length)
		{
			coinbaseEntries = coinbaseMap.get(AaayyConstantsEditMe.COINBASE_SYMBOLS[symbolIndex]);
			Iterator<Coinbaseentry> coinbaseEntries_it = null;
			Path coinbasePath = Paths.get(AaayyConstantsEditMe.COINBASE_LOCATIONS.get(AaayyConstantsEditMe.COINBASE_SYMBOLS[symbolIndex]));
			if(Files.isRegularFile(coinbasePath)) {
				try (BufferedReader in = new BufferedReader(new FileReader(AaayyConstantsEditMe.COINBASE_LOCATIONS.get(AaayyConstantsEditMe.COINBASE_SYMBOLS[symbolIndex])))) {
					coinbaseEntries = in.lines().skip(4).map(line -> {
						String[] x = pattern.split(line);
						//                      (String timestamp, String type, double amount,            double subtotal,          double fees,              double total,	            String currency, double pricePerCoin,      String paymentMethod, String id, String share)
						return new Coinbaseentry(x[0],             x[1],        Double.parseDouble(x[2]), Double.parseDouble(x[3]), Double.parseDouble(x[4]), Double.parseDouble(x[5]), x[6],            Double.parseDouble(x[7]), x[8],                 x[9],      x[10]);
					}).collect(Collectors.toList());
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			coinbaseEntries_it = coinbaseEntries.iterator();
			while(coinbaseEntries_it.hasNext())
			{
				coinbaseentry = coinbaseEntries_it.next();
				utc_timestamp = coinbaseentry.getTimestamp();
				
				try {
					d = coinbaseDateFormat.parse(utc_timestamp);
					ms_timestamp = d.getTime();
				} catch (ParseException e) {
					e.printStackTrace();
				}

				if(excludeSpecial && (ms_timestamp == 1457487839000L || ms_timestamp == 1457789853000L || ms_timestamp == 1457865661000L))  //1457487839000 // 1457789853000 // 1457865661000
				{
					// I (stupidly) made 3 Coinbase BTC purchases for someone else which jacked up my transaction history. Here I'm excluding them.
					System.out.println("Excluding special BTC buys");
				}
//				else if((-.0000001 <= coinbaseentry.getSubtotal() && coinbaseentry.getSubtotal() <= .0000001) || 
//						(-.0000001 <= coinbaseentry.getAmount() && coinbaseentry.getAmount() <= .0000001))
//				{
//					System.out.println("To or From amount is ALMOST zero. Skipping.");
//				}
				else
				{	
					entry = new Commonentry();
					entry.setExchangeName("coinbase");
					entry.setTimestamp(ms_timestamp);
					entry.setTimestampHr(outDf.format(new Date(ms_timestamp)));
					entry.setUsdDerivationMethod("first-hand");
					entry.setBtcDerivationMethod("first-hand");
					if(coinbaseentry.getType().toLowerCase().equals("buy"))
					{
						entry.setFromUnits("USD");
						entry.setToUnits(AaayyConstantsEditMe.COINBASE_SYMBOLS[symbolIndex]);
						entry.setFromAmount(coinbaseentry.getSubtotal());
						entry.setToAmount(coinbaseentry.getAmount());
						entry.setToPerFrom(entry.getFromAmount()/entry.getToAmount());
						entry.setUsdTotal(entry.getFromAmount());
					}
					else //if(coinbaseentry.getType().toLowerCase().equals("sell"))
					{
						entry.setFromUnits(AaayyConstantsEditMe.COINBASE_SYMBOLS[symbolIndex]);
						entry.setToUnits("USD");
						entry.setFromAmount(coinbaseentry.getAmount());
						entry.setToAmount(coinbaseentry.getSubtotal());
						entry.setToPerFrom(entry.getToAmount()/entry.getFromAmount());
						entry.setUsdTotal(entry.getToAmount());
					}
					
					if(entry.getToUnits().equals("BTC"))
					{
						entry.setBtcPriceInUsd(entry.getToAmount()/entry.getFromAmount());
						entry.setBtcAmount(entry.getUsdTotal()/entry.getBtcPriceInUsd());
						knownUsdPerBtcTicks.put(entry.getTimestamp(), entry.getBtcPriceInUsd());
					}
					else if(entry.getFromUnits().equals("BTC"))
					{
						entry.setBtcPriceInUsd(entry.getFromAmount()/entry.getToAmount());
						entry.setBtcAmount(entry.getUsdTotal()/entry.getBtcPriceInUsd());
						knownUsdPerBtcTicks.put(entry.getTimestamp(), entry.getBtcPriceInUsd());
					}
					else if(knownUsdPerBtcTicks.containsKey(entry.getTimestamp()))
					{
						entry.setBtcPriceInUsd(knownUsdPerBtcTicks.get(entry.getTimestamp()));
						entry.setBtcAmount(entry.getUsdTotal()/entry.getBtcPriceInUsd());
					}
					else // if not to/from BTC and not already known, we need to look up the price of BTC.
					{	
						HttpGetTriad getHistoricalPriceTriad = null;
						long intervalInMs = 30000L;
						while(getHistoricalPriceTriad == null)
						{	
							getHistoricalPriceTriad = gdaxHelper.getBtcPriceFromTimestamp(entry.getTimestamp(), intervalInMs);
							if (getHistoricalPriceTriad.getResponseStatusCode() != 200)
							{
								System.err.println("Got a non-200 retrieving price information from GDAX.");
								System.err.println(getHistoricalPriceTriad.stringify("test"));
								getHistoricalPriceTriad = null; // try again
							}
							else
							{
								System.out.println("COINBASE " + AaayyConstantsEditMe.COINBASE_SYMBOLS[symbolIndex] + " " + getHistoricalPriceTriad.getResponseString());
								JSONArray ticks_ja = (new JSONArray(getHistoricalPriceTriad.getResponseString()));
								if(ticks_ja.length() == 0)
								{
									getHistoricalPriceTriad = null; // try again
									intervalInMs*=2;
								}
								else
								{	
									JSONArray tick_ja = ticks_ja.getJSONArray(0); // should always parse into JSON
									entry.setBtcPriceInUsd(tick_ja.getDouble(4));
									entry.setBtcAmount(entry.getUsdTotal()/entry.getBtcPriceInUsd());
									knownUsdPerBtcTicks.put(entry.getTimestamp(), entry.getBtcPriceInUsd());
								}
							}
							try {
								System.out.println("sleeping between retries");
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
					entry.setBtcDerivationMethod("GDAX BTC-USD");
					entry.setFeeInUsd(coinbaseentry.getFees());
					entry.setCostBasisPerUnit(entry.getUsdTotal()/entry.getToAmount());
					commonentries.add(entry);
				}
				
			}
			
			System.out.print("Saving history to " + AaayyConstantsEditMe.UNIFIED_HISTORY_LOCATION);
			try {
				mapper.enable(SerializationFeature.INDENT_OUTPUT);
				mapper.writeValue(new File(AaayyConstantsEditMe.UNIFIED_HISTORY_LOCATION), commonentries);
			} catch (JsonGenerationException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("...done.");
			
			System.out.print("Saving usdPerBtc ticks to " + AaayyConstantsEditMe.KNOWN_USD_PER_BTC_TICKS_LOCATION);
			try {
				mapper.enable(SerializationFeature.INDENT_OUTPUT);
				mapper.writeValue(new File(AaayyConstantsEditMe.KNOWN_USD_PER_BTC_TICKS_LOCATION), knownUsdPerBtcTicks);
			} catch (JsonGenerationException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("...done.");
			
			symbolIndex++;
		}
		
		
		
		/***
		 *    ______ _____ _     _____ _   _ _____ _______   __
		 *    | ___ \  _  | |   |  _  | \ | |_   _|  ___\ \ / /
		 *    | |_/ / | | | |   | | | |  \| | | | | |__  \ V / 
		 *    |  __/| | | | |   | | | | . ` | | | |  __| /   \ 
		 *    | |   \ \_/ / |___\ \_/ / |\  |_| |_| |___/ /^\ \
		 *    \_|    \___/\_____/\___/\_| \_/\___/\____/\/   \/
		 *                                                     
		 */
		
		Poloniexentry poloniexentry = null;
		List<Poloniexentry> poloniexEntries = new ArrayList<Poloniexentry>();
		Path poloPath = Paths.get(AaayyConstantsEditMe.POLONIEX_LOCATION);
		if(Files.isRegularFile(poloPath)) {
			try (BufferedReader in = new BufferedReader(new FileReader(AaayyConstantsEditMe.POLONIEX_LOCATION));) {
				poloniexEntries = in.lines().skip(1).map(line -> {
					String[] x = pattern.split(line);
					//                      (String timestamp, String market, String category, String type, double price,             double amount,            double total,             String fee, String orderNumber, double baseTotalLessFee, double quoteTotalLessFee)
					return new Poloniexentry(x[0],             x[1],          x[2],            x[3],        Double.parseDouble(x[4]), Double.parseDouble(x[5]), Double.parseDouble(x[6]), x[7],       x[8],               Double.parseDouble(x[9]),Double.parseDouble(x[10]));
				}).collect(Collectors.toList());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		Iterator<Poloniexentry> poloniexEntries_it = poloniexEntries.iterator();
		DateFormat poloniexDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // poloniex timestamps formatted like: 2017-09-16 20:12:29
		while(poloniexEntries_it.hasNext())
		{
			poloniexentry = poloniexEntries_it.next();
			utc_timestamp = poloniexentry.getTimestamp();
			try {
				d = poloniexDateFormat.parse(utc_timestamp);
				ms_timestamp = d.getTime();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			if(excludeSpecial && (ms_timestamp >= 1458110029000L && ms_timestamp <= 1458318658000L))
			{
				// I (stupidly) made some Coinbase BTC purchases for someone else, then exchanged them for ETH on Poloniex, which jacked up my transaction history. Here I'm excluding them.
			}
			else if(excludeSpecial && (ms_timestamp == 1470379267000L))
			{
				// I helped someone else turn their ETC into ETH on Polo. Here I'm excluding these transactions.
			}
			else if((-.00001 <= poloniexentry.getQuoteTotalLessFee() && poloniexentry.getQuoteTotalLessFee() <= .00001) &&   // Polo does a weird thing with zero or near-zero trades which creates NaN doubles. So, 
					(-.00001 <= poloniexentry.getBaseTotalLessFee() && poloniexentry.getBaseTotalLessFee() <= .00001))       // if both sides of a trade are almost zero, just exclude it. HIGHLY unlikely to do a trade where both share prices (on both sides) are so high that this would matter. 
			{
				if(poloniexentry.getType().toLowerCase().equals("sell"))
				{
					System.out.println("POLO To or From amount is ALMOST zero. Skipping. (" + poloniexentry.getQuoteTotalLessFee() + " " + poloniexentry.getMarket().substring(0, poloniexentry.getMarket().indexOf("/")) + " to " + poloniexentry.getBaseTotalLessFee() + " " + poloniexentry.getMarket().substring(poloniexentry.getMarket().indexOf("/")+1) + ")");
				}
				else
				{
					System.out.println("POLO To or From amount is ALMOST zero. Skipping. (" + poloniexentry.getBaseTotalLessFee() + " " + poloniexentry.getMarket().substring(poloniexentry.getMarket().indexOf("/")+1) + " to " + poloniexentry.getQuoteTotalLessFee() + " " + poloniexentry.getMarket().substring(0, poloniexentry.getMarket().indexOf("/")) + ")");
				}
			}
			else
			{	
				entry = new Commonentry();
				entry.setExchangeName("poloniex");
				entry.setTimestamp(ms_timestamp);
				entry.setTimestampHr(outDf.format(new Date(entry.getTimestamp())));
				String marketLeft = poloniexentry.getMarket().substring(0, poloniexentry.getMarket().indexOf("/"));
				String marketRight = poloniexentry.getMarket().substring(poloniexentry.getMarket().indexOf("/")+1);
				
				if(poloniexentry.getType().toLowerCase().equals("sell"))
				{
					entry.setFromUnits(marketLeft);
					entry.setToUnits(marketRight);
					entry.setFromAmount(poloniexentry.getQuoteTotalLessFee()*-1);
					entry.setToAmount(poloniexentry.getBaseTotalLessFee());
					entry.setToPerFrom(entry.getToAmount()/entry.getFromAmount());
				}
				else //if(poloniexentry.getType().toLowerCase().equals("buy"))
				{
					entry.setFromUnits(marketRight);
					entry.setToUnits(marketLeft);
					entry.setFromAmount(poloniexentry.getBaseTotalLessFee()*-1);
					entry.setToAmount(poloniexentry.getQuoteTotalLessFee());
					entry.setToPerFrom(entry.getFromAmount()/entry.getToAmount());
				}
				
				if(marketLeft.equals("BTC") || marketRight.equals("BTC"))
				{
					if(knownUsdPerBtcTicks.containsKey(entry.getTimestamp()))
					{
//						System.out.println("POLONIEX BTC using known usdPerBtc tick");
						entry.setBtcPriceInUsd(knownUsdPerBtcTicks.get(entry.getTimestamp()));
						if(entry.getFromUnits().equals("BTC"))
						{
							entry.setBtcAmount(entry.getFromAmount());
							entry.setUsdTotal(entry.getBtcAmount()*entry.getBtcPriceInUsd());
						}
						else if(entry.getToUnits().equals("BTC"))
						{
							entry.setBtcAmount(entry.getToAmount());
							entry.setUsdTotal(entry.getBtcAmount()*entry.getBtcPriceInUsd());
						}
					}
					else
					{	
						HttpGetTriad getHistoricalPriceTriad = null;
						long intervalInMs = 30000L;
						while(getHistoricalPriceTriad == null)
						{	
							getHistoricalPriceTriad = gdaxHelper.getBtcPriceFromTimestamp(entry.getTimestamp(), intervalInMs);
							if (getHistoricalPriceTriad.getResponseStatusCode() != 200)
							{
								System.err.println("Got a non-200 retrieving price information from GDAX.");
								System.err.println(getHistoricalPriceTriad.stringify("test"));
								getHistoricalPriceTriad = null; // try again
							}
							else
							{
								System.out.println("POLONIEX BTC PAIRS " + getHistoricalPriceTriad.getResponseString());
								JSONArray ticks_ja = (new JSONArray(getHistoricalPriceTriad.getResponseString()));
								if(ticks_ja.length() == 0)
								{
									getHistoricalPriceTriad = null; // try again
									intervalInMs*=2;
								}
								else
								{	
									JSONArray tick_ja = ticks_ja.getJSONArray(0); // should always parse into JSON
									entry.setBtcPriceInUsd(tick_ja.getDouble(4));
									
									if(entry.getFromUnits().equals("BTC"))
									{
										entry.setBtcAmount(entry.getFromAmount());
										entry.setUsdTotal(entry.getBtcAmount()*entry.getBtcPriceInUsd());
									}
									else if(entry.getToUnits().equals("BTC"))
									{
										entry.setBtcAmount(entry.getToAmount());
										entry.setUsdTotal(entry.getBtcAmount()*entry.getBtcPriceInUsd());
									}
									knownUsdPerBtcTicks.put(entry.getTimestamp(), entry.getBtcPriceInUsd());
								}
							}
							try {
								System.out.println("sleeping between retries");
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
					entry.setBtcDerivationMethod("GDAX BTC-USD");
					entry.setUsdDerivationMethod("GDAX BTC-USD");
				}
				else if (marketLeft.equals("ETH") || marketRight.equals("ETH")) // ETH pairs that did not involve BTC...OMG/ETH, ZEC/ETH, REP/ETH, ETC/ETH -- do manually later?
				{
					double usdPerBtc = 0;
					double btcPerEth = 0;
					if(knownUsdPerBtcTicks.containsKey(entry.getTimestamp()))
					{
//						System.out.println("POLONIEX ETH using known usdPerBtc tick");
						usdPerBtc = knownUsdPerBtcTicks.get(entry.getTimestamp());
					}
					else
					{
						System.out.println("retrieving new usdPerBtc tick");
						HttpGetTriad getHistoricalPriceTriad = null;
						long intervalInMs = 30000L;
						while(getHistoricalPriceTriad == null)
						{	
							getHistoricalPriceTriad = gdaxHelper.getBtcPriceFromTimestamp(entry.getTimestamp(), intervalInMs);
							if (getHistoricalPriceTriad.getResponseStatusCode() != 200)
							{
								System.err.println("Got a non-200 retrieving price information from GDAX.");
								System.err.println(getHistoricalPriceTriad.stringify("test"));
								getHistoricalPriceTriad = null; // try again
							}
							else
							{
								System.out.println("POLONIEX ETH PAIRS " + getHistoricalPriceTriad.getResponseString());
								JSONArray ticks_ja = (new JSONArray(getHistoricalPriceTriad.getResponseString()));
								if(ticks_ja.length() == 0)
								{
									getHistoricalPriceTriad = null; // try again
									intervalInMs*=2;
								}
								else
								{	
									JSONArray tick_ja = ticks_ja.getJSONArray(0); // should always parse into JSON
									usdPerBtc = tick_ja.getDouble(4);
									knownUsdPerBtcTicks.put(entry.getTimestamp(), usdPerBtc);
								}
							}
							try {
								System.out.println("sleeping between retries");
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
					
					if(knownBtcPerEthTicks.containsKey(entry.getTimestamp()))
					{
//						System.out.println("POLONIEX ETH using known btcPerEth tick");
						btcPerEth = knownBtcPerEthTicks.get(entry.getTimestamp());
					}
					else
					{
						System.out.println("retrieving new btcPerEth tick");
						HttpGetTriad getHistoricalPriceTriad = null;
						long intervalInMs = 30000L;
						while(getHistoricalPriceTriad == null)
						{	
							getHistoricalPriceTriad = poloniexHelper.getBtcPerEthPriceFromTimestamp(entry.getTimestamp(), intervalInMs);
							if (getHistoricalPriceTriad.getResponseStatusCode() != 200)
							{
								System.err.println("Got a non-200 retrieving price information from Polo.");
								System.err.println(getHistoricalPriceTriad.stringify("test"));
								getHistoricalPriceTriad = null; // try again
							}
							else
							{
								System.out.println("POLONIEX ETH PAIRS " + getHistoricalPriceTriad.getResponseString());
								JSONArray ticks_ja = (new JSONArray(getHistoricalPriceTriad.getResponseString()));
								if(ticks_ja.length() == 0)
								{
									getHistoricalPriceTriad = null; // try again
									intervalInMs*=2;
								}
								else
								{	
									JSONObject tick_jo = ticks_ja.getJSONObject(0); // should always parse into JSON
									btcPerEth = tick_jo.getDouble("close");
									knownBtcPerEthTicks.put(entry.getTimestamp(), btcPerEth);
								}
							}
							try {
								System.out.println("sleeping between retries");
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
					
					// at this point, we should have usdPerBtc and btcPerEth
					entry.setBtcPriceInUsd(usdPerBtc);
					entry.setBtcDerivationMethod("GDAX BTC-USD");
					entry.setUsdDerivationMethod("GDAX BTC-USD + Polo BTC_ETH");
					if(entry.getFromUnits().equals("ETH"))
					{
						entry.setBtcAmount(entry.getFromAmount() * btcPerEth);
					}
					else if(entry.getToUnits().equals("ETH"))
					{
						entry.setBtcAmount(entry.getToAmount() * btcPerEth);
					}
					entry.setUsdTotal(entry.getBtcAmount()*entry.getBtcPriceInUsd());
					knownUsdPerBtcTicks.put(entry.getTimestamp(), entry.getBtcPriceInUsd());
				}
				else
				{
					// non BTC, non ETH unsupported as of right now
				}
				
				if(poloniexentry.getType().toLowerCase().equals("sell")) // if "sell", then the fee is taken from the "total" column
				{
					double feeInNative = poloniexentry.getTotal()-poloniexentry.getBaseTotalLessFee(); // i.e. the fee in terms of the "To" denomination
					if(entry.getToUnits().equals("BTC"))
						entry.setFeeInUsd(feeInNative * entry.getBtcPriceInUsd());
					else if(entry.getToUnits().equals("ETH"))
						entry.setFeeInUsd(feeInNative * (entry.getUsdTotal()/entry.getToAmount()));
					else
					{
						System.err.println("Found polo sell entry with a \"to\" not BTC or ETH ts=" + entry.getTimestamp());
						System.exit(1);
					}
				}
				else //if(poloniexentry.getType().toLowerCase().equals("buy")) // if "buy", the fee is taken from the "amount" column
				{
					double feeInNative = poloniexentry.getAmount()-poloniexentry.getQuoteTotalLessFee(); // i.e. the fee in terms of the "From" denomination
					if(entry.getFromUnits().equals("BTC"))
						entry.setFeeInUsd(feeInNative * entry.getBtcPriceInUsd());
					else if(entry.getFromUnits().equals("ETH"))
						entry.setFeeInUsd(feeInNative * (entry.getUsdTotal()/entry.getFromAmount()));
					else
					{
						System.err.println("Found polo buy entry with a \"from\" not BTC or ETH ts=" + entry.getTimestamp());
						System.exit(1);
					}
				}
				entry.setCostBasisPerUnit(entry.getUsdTotal()/entry.getToAmount());
				commonentries.add(entry);
			}
		}
		
		System.out.print("Saving history to " + AaayyConstantsEditMe.UNIFIED_HISTORY_LOCATION);
		try {
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			mapper.writeValue(new File(AaayyConstantsEditMe.UNIFIED_HISTORY_LOCATION), commonentries);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("...done.");
		
		System.out.print("Saving usdPerBtc ticks to " + AaayyConstantsEditMe.KNOWN_USD_PER_BTC_TICKS_LOCATION);
		try {
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			mapper.writeValue(new File(AaayyConstantsEditMe.KNOWN_USD_PER_BTC_TICKS_LOCATION), knownUsdPerBtcTicks);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("...done.");
		
		System.out.print("Saving btcPerEth ticks to " + AaayyConstantsEditMe.KNOWN_BTC_PER_ETH_TICKS_LOCATION);
		try {
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			mapper.writeValue(new File(AaayyConstantsEditMe.KNOWN_BTC_PER_ETH_TICKS_LOCATION), knownBtcPerEthTicks);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("...done.");
		
		/***
		 *     ___________  ___  __   __ 
		 *    |  __ \  _  \/ _ \ \ \ / / 
		 *    | |  \/ | | / /_\ \ \ V /  
		 *    | | __| | | |  _  | /   \  
		 *    | |_\ \ |/ /| | | |/ /^\ \ 
		 *     \____/___/ \_| |_/\/   \/ 
		 *                                                  
		 *                                                  
		 */
		
		Map<String,List<Gdaxentry>> gdaxMap = new HashMap<String,List<Gdaxentry>>();
		Gdaxentry gdaxentry;
		symbolIndex = 0;
		List<Gdaxentry> gdaxEntries;
		while(symbolIndex < AaayyConstantsEditMe.COINBASE_SYMBOLS.length) // same as GDAX
		{
			gdaxEntries = gdaxMap.get(AaayyConstantsEditMe.COINBASE_SYMBOLS[symbolIndex]);  // same as GDAX
			Iterator<Gdaxentry> gdaxEntries_it = null;
			Path gdaxPath = Paths.get(AaayyConstantsEditMe.GDAX_LOCATIONS.get(AaayyConstantsEditMe.COINBASE_SYMBOLS[symbolIndex]));
			if(Files.isRegularFile(gdaxPath)) {
				try (BufferedReader in = new BufferedReader(new FileReader(AaayyConstantsEditMe.GDAX_LOCATIONS.get(AaayyConstantsEditMe.COINBASE_SYMBOLS[symbolIndex])));) {
					gdaxEntries = in.lines().skip(1).map(line -> {
						String[] x = pattern.split(line);
						//                  (String tradeId, String product, String side, String createdAt, double size,              String sizeUnit, double price,             double fee,              double total,            String priceFeeTotalUnit)
						return new Gdaxentry(x[0],           x[1],           x[2],        x[3],             Double.parseDouble(x[4]), x[5],            Double.parseDouble(x[6]), Double.parseDouble(x[7]),Double.parseDouble(x[8]),(x[9]));
					}).collect(Collectors.toList());
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			gdaxEntries_it = gdaxEntries.iterator();
			while(gdaxEntries_it.hasNext())
			{
				gdaxentry = gdaxEntries_it.next();
				DateFormat utcDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"); // gdax timestamps formatted like: 2017-06-02T19:33:41.729Z
				utcDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
				utc_timestamp = gdaxentry.getCreatedAt();
				try {
					d = utcDateFormat.parse(utc_timestamp);
					ms_timestamp = d.getTime();
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				if((-.0000001 <= gdaxentry.getSize() && gdaxentry.getSize() <= .0000001) || 
						(-.0000001 <= gdaxentry.getTotal() && gdaxentry.getTotal() <= .0000001))
				{
					System.out.println("To or From amount is ALMOST zero. Skipping. (" + gdaxentry.getTotal() + " USD to " + gdaxentry.getSize() + " BTC)");
				}
				else
				{	
					entry = new Commonentry();
					entry.setExchangeName("gdax");
					entry.setTimestamp(ms_timestamp);
					entry.setTimestampHr(outDf.format(new Date(entry.getTimestamp())));
					entry.setUsdDerivationMethod("first-hand");
					entry.setFeeInUsd(gdaxentry.getFee());
					String marketLeft = gdaxentry.getProduct().substring(0, gdaxentry.getProduct().indexOf("-")); // ETH or BTC or LTC or BCH
					String marketRight = gdaxentry.getProduct().substring(gdaxentry.getProduct().indexOf("-")+1); // USD
					if(gdaxentry.getSide().toLowerCase().equals("sell")) //  BTC-USD + SELL means from BTC to USD
					{
						entry.setFromUnits(marketLeft);
						entry.setToUnits(marketRight);
						entry.setFromAmount(gdaxentry.getSize());
						entry.setToAmount(gdaxentry.getTotal());
						entry.setToPerFrom(gdaxentry.getPrice());
						entry.setUsdTotal(entry.getToAmount());
						entry.setBtcAmount(entry.getFromAmount());
					}
					else // if(gdaxentry.getSide().toLowerCase().equals("buy")) //  ETH-USD + BUY means from USD to ETH
					{
						entry.setFromUnits(marketRight);
						entry.setToUnits(marketLeft);
						entry.setFromAmount(gdaxentry.getTotal()*-1); // gdax has these as negative
						entry.setToAmount(gdaxentry.getSize());
						entry.setToPerFrom(1/gdaxentry.getPrice());
						entry.setUsdTotal(entry.getFromAmount());
						entry.setBtcAmount(entry.getToAmount());
					}
					
					if(entry.getToUnits().equals("BTC"))
					{
						entry.setBtcPriceInUsd(entry.getToAmount()/entry.getFromAmount());
						entry.setBtcAmount(entry.getUsdTotal()/entry.getBtcPriceInUsd());
						knownUsdPerBtcTicks.put(entry.getTimestamp(), entry.getBtcPriceInUsd());
						entry.setBtcDerivationMethod("first-hand");
					}
					else if(entry.getFromUnits().equals("BTC"))
					{
						entry.setBtcPriceInUsd(entry.getFromAmount()/entry.getToAmount());
						entry.setBtcAmount(entry.getUsdTotal()/entry.getBtcPriceInUsd());
						knownUsdPerBtcTicks.put(entry.getTimestamp(), entry.getBtcPriceInUsd());
						entry.setBtcDerivationMethod("first-hand");
					}
					else if(knownUsdPerBtcTicks.containsKey(entry.getTimestamp()))
					{
						entry.setBtcPriceInUsd(knownUsdPerBtcTicks.get(entry.getTimestamp()));
						entry.setBtcAmount(entry.getUsdTotal()/entry.getBtcPriceInUsd());
						entry.setBtcDerivationMethod("known usdPerBtc tick");
					}
					else // if not to/from BTC and not already known, we need to look up the price of BTC.
					{	
						HttpGetTriad getHistoricalPriceTriad = null;
						long intervalInMs = 30000L;
						while(getHistoricalPriceTriad == null)
						{	
							getHistoricalPriceTriad = gdaxHelper.getBtcPriceFromTimestamp(entry.getTimestamp(), intervalInMs);
							if (getHistoricalPriceTriad.getResponseStatusCode() != 200)
							{
								System.err.println("Got a non-200 retrieving price information from GDAX.");
								System.err.println(getHistoricalPriceTriad.stringify("test"));
								getHistoricalPriceTriad = null; // try again
							}
							else
							{
								System.out.println("GDAX " + AaayyConstantsEditMe.COINBASE_SYMBOLS[symbolIndex] + " " + getHistoricalPriceTriad.getResponseString());
								JSONArray ticks_ja = (new JSONArray(getHistoricalPriceTriad.getResponseString()));
								if(ticks_ja.length() == 0)
								{
									getHistoricalPriceTriad = null; // try again
									intervalInMs*=2;
								}
								else
								{	
									JSONArray tick_ja = ticks_ja.getJSONArray(0); // should always parse into JSON
									entry.setBtcPriceInUsd(tick_ja.getDouble(4));
									entry.setBtcAmount(entry.getUsdTotal()/entry.getBtcPriceInUsd());
									knownUsdPerBtcTicks.put(entry.getTimestamp(), entry.getBtcPriceInUsd());
									entry.setBtcDerivationMethod("GDAX BTC-USD");
								}
							}
							try {
								System.out.println("sleeping between retries");
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
					entry.setFeeInUsd(coinbaseentry.getFees());
					entry.setCostBasisPerUnit(entry.getUsdTotal()/entry.getToAmount());
					commonentries.add(entry);
				}
			}
			
			System.out.print("Saving history to " + AaayyConstantsEditMe.UNIFIED_HISTORY_LOCATION);
			try {
				mapper.enable(SerializationFeature.INDENT_OUTPUT);
				mapper.writeValue(new File(AaayyConstantsEditMe.UNIFIED_HISTORY_LOCATION), commonentries);
			} catch (JsonGenerationException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("...done.");
			
			System.out.print("Saving usdPerBtc ticks to " + AaayyConstantsEditMe.KNOWN_USD_PER_BTC_TICKS_LOCATION);
			try {
				mapper.enable(SerializationFeature.INDENT_OUTPUT);
				mapper.writeValue(new File(AaayyConstantsEditMe.KNOWN_USD_PER_BTC_TICKS_LOCATION), knownUsdPerBtcTicks);
			} catch (JsonGenerationException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("...done.");
			
			symbolIndex++;
		}
		
		/***
		 *     _____  ________  ________ _   _ _____  
		 *    |  __ \|  ___|  \/  |_   _| \ | |_   _| 
		 *    | |  \/| |__ | .  . | | | |  \| | | |  
		 *    | | __ |  __|| |\/| | | | | . ` | | |  
		 *    | |_\ \| |___| |  | |_| |_| |\  |_| |_  
		 *     \____/\____/\_|  |_/\___/\_| \_/\___/  
		 *                                                                
		 *                                                                
		 */
		
		Geminientry geminientry = null;
		List<Geminientry> geminiEntries = new ArrayList<Geminientry>();
		Path geminiPath = Paths.get(AaayyConstantsEditMe.GEMINI_LOCATION);
		if(Files.isRegularFile(geminiPath)) {
			try (BufferedReader in = new BufferedReader(new FileReader(AaayyConstantsEditMe.GEMINI_LOCATION));) {
				geminiEntries = in.lines().skip(1).map(line -> {
					String[] x = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1); // handles "," inside quotes
					//					  (String date, String time,	String type,	String symbol, 	String specification, 	String liquidityIndicator, 	String tradingFeeRate, 		String usdAmount, 	String tradingFeeUsd, 	String usdBalance, 	String btcAmount, 	String tradingFeeBtc, 		String btcBalance, 	String ethAmount, 	String ethBalance)
					return new Geminientry(x[0], 		x[1], 			x[2], 			x[3], 			x[4], 					x[5], 						x[6], 	x[7], 				x[8], 					x[9], 				x[10], 				x[11], 	x[12], 				x[13], 				x[14]);
				}).collect(Collectors.toList());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		Iterator<Geminientry> geminiEntries_it = geminiEntries.iterator();
		while(geminiEntries_it.hasNext())
		{
			geminientry = geminiEntries_it.next();
			if(!geminientry.getType().toLowerCase().equals("buy") && !geminientry.getType().toLowerCase().equals("sell")) // if not a buy and not a sell, ignore.
			{
				
			}
			else
			{
				DateFormat utcDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"); 		// gemini timestamps formatted like: 2017-06-26, 19:25:10.430 (as two separate columns)
				utcDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
				try {
					d = utcDateFormat.parse(geminientry.getDate() + " "  + geminientry.getTime()); 	// combining the two columns here for parsing purposes.
					ms_timestamp = d.getTime();
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				if((-.0000001 <= getDoubleFromString(geminientry.getEthAmount()) && getDoubleFromString(geminientry.getEthAmount()) <= .0000001) || 
						(-.0000001 <= getDoubleFromString(geminientry.getUsdAmount()) && getDoubleFromString(geminientry.getUsdAmount()) <= .0000001))
				{
					System.out.println("GEMINI To or From amount is ALMOST zero. Skipping. (" + getDoubleFromString(geminientry.getUsdAmount()) + " USD to " + getDoubleFromString(geminientry.getEthAmount()) + " ETH)");
				}
				else
				{	
					entry = new Commonentry();
					entry.setExchangeName("gemini");
					entry.setTimestamp(ms_timestamp);
					entry.setTimestampHr(outDf.format(new Date(entry.getTimestamp())));
					entry.setUsdDerivationMethod("first-hand");
					entry.setFeeInUsd(getDoubleFromString(geminientry.getTradingFeeUsd()));
					if(getDoubleFromString(geminientry.getEthAmount()) > 0)
					{
						if(geminientry.getType().toLowerCase().equals("sell")) //  ETH-USD + SELL means from ETH to USD
						{
							entry.setFromUnits("ETH");
							entry.setToUnits("USD");
							entry.setFromAmount(getDoubleFromString(geminientry.getEthAmount()));
							entry.setToAmount(getDoubleFromString(geminientry.getUsdAmount()));
							entry.setToPerFrom(entry.getToAmount()/entry.getFromAmount());
							entry.setUsdTotal(entry.getToAmount());
						}
						else // "buy"
						{
							entry.setFromUnits("USD");
							entry.setToUnits("ETH");
							entry.setFromAmount(getDoubleFromString(geminientry.getUsdAmount()));
							entry.setToAmount(getDoubleFromString(geminientry.getEthAmount()));
							entry.setToPerFrom(entry.getToAmount()/entry.getFromAmount());
							entry.setUsdTotal(entry.getFromAmount());
						}
						
						if(knownUsdPerBtcTicks.containsKey(entry.getTimestamp()))
						{
	//						System.out.println("GEMINI ETH using known usdPerBtc tick");
							entry.setBtcPriceInUsd(knownUsdPerBtcTicks.get(entry.getTimestamp()));
							entry.setBtcAmount(entry.getUsdTotal()/entry.getBtcPriceInUsd());
						}
						else
						{	
							System.out.println("GEMINI ETH retrieving new usdPerBtc tick");
							HttpGetTriad getHistoricalPriceTriad = null;
							long intervalInMs = 30000L;
							while(getHistoricalPriceTriad == null)
							{	
								getHistoricalPriceTriad = gdaxHelper.getBtcPriceFromTimestamp(entry.getTimestamp(), intervalInMs);
								if (getHistoricalPriceTriad.getResponseStatusCode() != 200)
								{
									System.err.println("Got a non-200 retrieving price information from GDAX.");
									System.err.println(getHistoricalPriceTriad.stringify("test"));
									getHistoricalPriceTriad = null; // try again
								}
								else
								{
									System.out.println("GEMINI ETH " + getHistoricalPriceTriad.getResponseString());
									JSONArray ticks_ja = (new JSONArray(getHistoricalPriceTriad.getResponseString()));
									if(ticks_ja.length() == 0)
									{
										getHistoricalPriceTriad = null; // try again
										intervalInMs*=2;
									}
									else
									{	
										JSONArray tick_ja = ticks_ja.getJSONArray(0); // should always parse into JSON
										entry.setBtcPriceInUsd(tick_ja.getDouble(4));
										entry.setBtcAmount(entry.getUsdTotal()/entry.getBtcPriceInUsd());
										knownUsdPerBtcTicks.put(entry.getTimestamp(), entry.getBtcPriceInUsd());
									}
								}
								try {
									System.out.println("sleeping between retries");
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
						}
						entry.setBtcDerivationMethod("GDAX BTC-USD");
					}
					else if(getDoubleFromString(geminientry.getBtcAmount()) > 0)
					{
						if(geminientry.getType().toLowerCase().equals("sell")) //  ETH-USD + SELL means from ETH to USD
						{
							entry.setFromUnits("BTC");
							entry.setToUnits("USD");
							entry.setFromAmount(getDoubleFromString(geminientry.getBtcAmount()));
							entry.setToAmount(getDoubleFromString(geminientry.getUsdAmount()));
							entry.setToPerFrom(entry.getToAmount()/entry.getFromAmount());
							entry.setUsdTotal(entry.getToAmount());
						}
						else // "buy"
						{
							entry.setFromUnits("USD");
							entry.setToUnits("BTC");
							entry.setFromAmount(getDoubleFromString(geminientry.getUsdAmount()));
							entry.setToAmount(getDoubleFromString(geminientry.getBtcAmount()));
							entry.setToPerFrom(entry.getToAmount()/entry.getFromAmount());
							entry.setUsdTotal(entry.getFromAmount());
						}
						entry.setBtcAmount(getDoubleFromString(geminientry.getBtcAmount()));
						entry.setBtcPriceInUsd(getDoubleFromString(geminientry.getUsdAmount())/getDoubleFromString(geminientry.getBtcAmount()));
						entry.setBtcDerivationMethod("first-hand");
					}
					entry.setCostBasisPerUnit(entry.getUsdTotal()/entry.getToAmount());
					commonentries.add(entry);
				}
			}
		}
		
		System.out.print("Saving history to " + AaayyConstantsEditMe.UNIFIED_HISTORY_LOCATION);
		try {
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			mapper.writeValue(new File(AaayyConstantsEditMe.UNIFIED_HISTORY_LOCATION), commonentries);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("...done.");
		
		System.out.print("Saving usdPerBtc ticks to " + AaayyConstantsEditMe.KNOWN_USD_PER_BTC_TICKS_LOCATION);
		try {
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			mapper.writeValue(new File(AaayyConstantsEditMe.KNOWN_USD_PER_BTC_TICKS_LOCATION), knownUsdPerBtcTicks);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("...done.");
		
		System.out.print("Saving btcPerEth ticks to " + AaayyConstantsEditMe.KNOWN_BTC_PER_ETH_TICKS_LOCATION);
		try {
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			mapper.writeValue(new File(AaayyConstantsEditMe.KNOWN_BTC_PER_ETH_TICKS_LOCATION), knownBtcPerEthTicks);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("...done.");
		
	}
	
	// utility function for Gemini "($1,500.00)"-style entries.
	public double getDoubleFromString(String _string)
	{
		boolean isNegative = false;
		if(_string.startsWith("(") && _string.endsWith(")"))
			isNegative = true;
		
		String newString = _string.replaceAll("[^\\d.]",""); // get rid of anything that isn't a digit or a decimal
		double returnDouble = Double.parseDouble(newString);
		if(isNegative)
			returnDouble*=-1;
				
		return returnDouble;
	}
	
    public static void main( String[] args )
    {
        HistoryAssembler myApp = new HistoryAssembler();
        try {
			myApp.process();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
