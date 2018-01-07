package crypto.thing;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class GdaxHelper {

	private GetExecutionHandler getExecutionHandler;
	
	public GdaxHelper(){
		getExecutionHandler = new GetExecutionHandler();
	}
	
	public HttpGetTriad getBtcPriceFromTimestamp(long timestampInMs, long intervalInMs) throws ClientProtocolException, IOException 
	{
		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
		CloseableHttpClient httpclient = httpClientBuilder.build();
		
		DateFormat isoDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		isoDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		
		String requestUri = "https://api.gdax.com/products/BTC-USD/candles?start=" + isoDateFormat.format(new Date(timestampInMs)) + "&end=" + isoDateFormat.format(new Date(timestampInMs+intervalInMs));
		System.out.println(requestUri);
//		https://api.gdax.com/products/BTC-USD/candles?start=2017-06-26T16:32:31-04:00&end=2017-06-26T16:33:00-04:00
		HttpGet httpGet = new HttpGet(requestUri); // 1m window
//		httpGet.addHeader("Authorization", "Bearer " + access_token); 
		
		HttpGetTriad triad = getExecutionHandler.doExecution(httpclient, httpGet);
		
		return triad;
	}
	
//	public HttpGetTriad getEthPriceFromTimestamp(long timestampInMs, long intervalInMs) throws ClientProtocolException, IOException 
//	{
//		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
//		CloseableHttpClient httpclient = httpClientBuilder.build();
//		
//		DateFormat isoDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
//		isoDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
//		
//		String requestUri = "https://api.gdax.com/products/ETH-USD/candles?start=" + isoDateFormat.format(new Date(timestampInMs)) + "&end=" + isoDateFormat.format(new Date(timestampInMs+intervalInMs));
//		System.out.println(requestUri);
////		https://api.gdax.com/products/BTC-USD/candles?start=2017-06-26T16:32:31-04:00&end=2017-06-26T16:33:00-04:00
//		HttpGet httpGet = new HttpGet(requestUri); // 1m window
////		httpGet.addHeader("Authorization", "Bearer " + access_token); 
//		
//		HttpGetTriad triad = getExecutionHandler.doExecution(httpclient, httpGet);
//		
//		return triad;
//	}
	
}
