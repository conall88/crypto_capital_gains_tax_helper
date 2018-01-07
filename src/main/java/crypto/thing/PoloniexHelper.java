package crypto.thing;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class PoloniexHelper {

	private GetExecutionHandler getExecutionHandler;
	
	public PoloniexHelper(){
		getExecutionHandler = new GetExecutionHandler();
	}
	
	public HttpGetTriad getBtcPerEthPriceFromTimestamp(long timestampInMs, long intervalInMs) throws ClientProtocolException, IOException 
	{
		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
		CloseableHttpClient httpclient = httpClientBuilder.build();
		// https://poloniex.com/public?command=returnChartData&currencyPair=BTC_ETH&start=1494174991&end=1494194991&period=14400
		String requestUri = "https://poloniex.com/public?command=returnChartData&currencyPair=BTC_ETH&start=" + (timestampInMs/1000) + "&end=" + ((timestampInMs/1000)+14400) + "&period=14400";
		System.out.println(requestUri);
		HttpGet httpGet = new HttpGet(requestUri); // 1m window
		
		HttpGetTriad triad = getExecutionHandler.doExecution(httpclient, httpGet);
		
		return triad;
	}
	
//	https://poloniex.com/public?command=returnChartData&currencyPair=USDT_BTC&start=1494174991&end=1494194991&period=14400
	
//	public HttpGetTriad getUSDTPerBTCPriceFromTimestamp(long timestampInMs, long intervalInMs) throws ClientProtocolException, IOException 
//	{
//		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
//		CloseableHttpClient httpclient = httpClientBuilder.build();
//		// https://poloniex.com/public?command=returnChartData&currencyPair=BTC_ETH&start=1494174991&end=1494194991&period=14400
////		[{"date":1494187200,"high":1657,"low":1581.1,"open":1591,"close":1620.15,"volume":8806990.9184614,"quoteVolume":5467.25367764,"weightedAverage":1610.86194966}]
//		String requestUri = "https://poloniex.com/public?command=returnChartData&currencyPair=USDT_BTC&start=" + (timestampInMs/1000) + "&end=" + ((timestampInMs/1000)+14400) + "&period=14400";
//		System.out.println(requestUri);
//		HttpGet httpGet = new HttpGet(requestUri); // 1m window
//		
//		HttpGetTriad triad = getExecutionHandler.doExecution(httpclient, httpGet);
//		
//		return triad;
//	}
//	
//	public HttpGetTriad getEthPriceFromTimestamp(long timestampInMs, long intervalInMs) throws ClientProtocolException, IOException 
//	{
//		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
//		CloseableHttpClient httpclient = httpClientBuilder.build();
//		
//		String requestUri = "https://poloniex.com/public?command=returnChartData&currencyPair=USDT_ETH&start=" + (timestampInMs/1000) + "&end=" + ((timestampInMs/1000)+14400) + "&period=14400";
//		System.out.println(requestUri);
//		HttpGet httpGet = new HttpGet(requestUri); // 1m window
//		
//		HttpGetTriad triad = getExecutionHandler.doExecution(httpclient, httpGet);
//		
//		return triad;
//	}
	
}
