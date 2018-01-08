package crypto.thing;

import java.util.HashMap;
import java.util.Map;

public class AaayyConstantsEditMe {
	
	/*
	 HistoryAssembler will query external data sources for price information. 
	 The first time around, it takes a long time, but thanks to these two files, each lookup only has to be done once.
	 This is especially helpful if you need to run this program many times to get things right.
	 */
	
	public static String KNOWN_USD_PER_BTC_TICKS_LOCATION = "/home/cyrus/Desktop/taxes/knownUsdPerBtcTicks.json";
	public static String KNOWN_BTC_PER_ETH_TICKS_LOCATION = "/home/cyrus/Desktop/taxes/knownBtcPerEthTicks.json";
	
	/*
	 HistoryAssembler needs to know the location of your various exchange CSV files.
	 */
	
	public static Map<String,String> COINBASE_LOCATIONS;
	static
    {
		COINBASE_LOCATIONS = new HashMap<String, String>();
		COINBASE_LOCATIONS.put("BTC", "/home/cyrus/Desktop/taxes/Coinbase-BTC.csv");
		COINBASE_LOCATIONS.put("ETH", "/home/cyrus/Desktop/taxes/Coinbase-ETH.csv");
		COINBASE_LOCATIONS.put("LTC", "/home/cyrus/Desktop/taxes/Coinbase-LTC.csv");
		COINBASE_LOCATIONS.put("BCH", "/home/cyrus/Desktop/taxes/Coinbase-BCH.csv");
    }
	public static String POLONIEX_LOCATION = "/home/cyrus/Desktop/taxes/Poloniex.csv";	  			// This is just the trade history. We don't care about sends/receipts to/from Polo addresses. 
	public static Map<String,String> GDAX_LOCATIONS;
	static
    {
		GDAX_LOCATIONS = new HashMap<String, String>();
		GDAX_LOCATIONS.put("BTC", "/home/cyrus/Desktop/taxes/GDAX-BTC.csv");
		GDAX_LOCATIONS.put("ETH", "/home/cyrus/Desktop/taxes/GDAX-ETH.csv");
		GDAX_LOCATIONS.put("LTC", "/home/cyrus/Desktop/taxes/GDAX-LTC.csv");
		GDAX_LOCATIONS.put("BCH", "/home/cyrus/Desktop/taxes/GDAX-BCH.csv");
    }
	public static String GEMINI_LOCATION = "/home/cyrus/Desktop/taxes/Gemini.csv";					// Gemini provides an xlsx file which you'll need to load in in a spreadsheet app and export to CSV. ETH and BTC are combined.  (I think. I didn't use BTC.)
	
	/*
	 Where to put the unified set of transactions and then the final sales analysis.
	 */
	public static String UNIFIED_HISTORY_LOCATION = "/home/cyrus/Desktop/taxes/unifiedHistory.json";
	public static String SALES_ANALYSIS_CSV_LOCATION = "/home/cyrus/Desktop/taxes/salesAnalysis.csv";
	
	/*
	 The symbols for GDAX and Coinbase. You can leave these alone, even if you didn't have trades of certain types. 
	 */
	public static String[] COINBASE_SYMBOLS = {"BTC", "ETH", "BCH", "LTC"};
	
	
}
