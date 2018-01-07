package crypto.thing;
/*
 * 
Date		,Time (UTC)		,Type	,Symbol	,Specification			,Liquidity Indicator,Trading Fee Rate (bps)	,USD Amount		,Trading Fee (USD)	,USD Balance	,BTC Amount	,Trading Fee (BTC)	,BTC Balance	,ETH Amount			,ETH Balance	,Trade ID,Order ID,Order Date,Order Time,Client Order ID,API Session,Tx Hash,Deposit Tx Output,Withdrawal Destination,Withdrawal Tx Output
2017-06-26	,19:25:10.430	,Credit	,USD   	,Deposit (Wire Transfer),					,                   	,"$7,500.00"	,					,"$7,500.00 "	,			,					,0.0 BTC 		,					,0.0 ETH 		,,,,,,,,,,
2017-06-26	,20:32:31.075	,Buy   	,ETHUSD	,Market					,Taker				,25.00					,"($7,481.30)"	,($18.70)			,$0.00 			,			,					,0.0 BTC 		,34.23934443 ETH	,34.23934443 ETH,829467569,829467567,2017-06-26,20:32:31.072,,,,,,
2017-06-27	,16:16:00.258	,Debit 	,ETH	,Withdrawal (ETH)		,       			,                   	,				,					,$0.00			,			,					,0.0 BTC 		,(17.12 ETH)		,17.11934443 ETH,,,,,,,bc23fe0c77bae8a105fc39c1477d577e470513422605a9a71559bdab72b847a6,,0x47fa9ec5c244fb3f60723967c07fcff99c7e6bb8,
2017-06-27	,16:16:30.569	,Debit 	,ETH	,Withdrawal (ETH)		,       			,                  		,				,					,$0.00			,			,					,0.0 BTC 		,(17.11934443 ETH)	,0.0 ETH 		,,,,,,,a375b4556bcc0e21a1753cf7e553aa8bbc325ca89b690d3483807501fa0decf5,,0xa8260cffb7dff051920532d65f946c6acd32368b,
 */

public class Geminientry {

	private String date;
	private String time;
	private String type;
	private String symbol;
	private String specification;
	private String liquidityIndicator;
	private String tradingFeeRate; 
	private String usdAmount; 			// dollar signs and parentheses... ugh
	private String tradingFeeUsd;		// dollar signs and parentheses... ugh
	private String usdBalance;			// dollar signs and parentheses... ugh
	private String btcAmount;
	private String tradingFeeBtc;
	private String btcBalance;			// 0.0 BTC... ugh
	private String ethAmount;			// e.g. (17.11934443 ETH)
	private String ethBalance;			// e.g. 34.23934443 ETH
	
	
	
	
	public Geminientry(String date, String time, String type, String symbol, String specification,
			String liquidityIndicator, String tradingFeeRate, String usdAmount, String tradingFeeUsd, String usdBalance,
			String btcAmount, String tradingFeeBtc, String btcBalance, String ethAmount, String ethBalance) {
		super();
		this.date = date;
		this.time = time;
		this.type = type;
		this.symbol = symbol;
		this.specification = specification;
		this.liquidityIndicator = liquidityIndicator;
		this.tradingFeeRate = tradingFeeRate;
		this.usdAmount = usdAmount;
		this.tradingFeeUsd = tradingFeeUsd;
		this.usdBalance = usdBalance;
		this.btcAmount = btcAmount;
		this.tradingFeeBtc = tradingFeeBtc;
		this.btcBalance = btcBalance;
		this.ethAmount = ethAmount;
		this.ethBalance = ethBalance;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public String getLiquidityIndicator() {
		return liquidityIndicator;
	}
	public void setLiquidityIndicator(String liquidityIndicator) {
		this.liquidityIndicator = liquidityIndicator;
	}
	public String getTradingFeeRate() {
		return tradingFeeRate;
	}
	public void setTradingFeeRate(String tradingFeeRate) {
		this.tradingFeeRate = tradingFeeRate;
	}
	public String getUsdAmount() {
		return usdAmount;
	}
	public void setUsdAmount(String usdAmount) {
		this.usdAmount = usdAmount;
	}
	public String getTradingFeeUsd() {
		return tradingFeeUsd;
	}
	public void setTradingFeeUsd(String tradingFeeUsd) {
		this.tradingFeeUsd = tradingFeeUsd;
	}
	public String getUsdBalance() {
		return usdBalance;
	}
	public void setUsdBalance(String usdBalance) {
		this.usdBalance = usdBalance;
	}
	public String getBtcAmount() {
		return btcAmount;
	}
	public void setBtcAmount(String btcAmount) {
		this.btcAmount = btcAmount;
	}
	public String getTradingFeeBtc() {
		return tradingFeeBtc;
	}
	public void setTradingFeeBtc(String tradingFeeBtc) {
		this.tradingFeeBtc = tradingFeeBtc;
	}
	public String getBtcBalance() {
		return btcBalance;
	}
	public void setBtcBalance(String btcBalance) {
		this.btcBalance = btcBalance;
	}
	public String getEthAmount() {
		return ethAmount;
	}
	public void setEthAmount(String ethAmount) {
		this.ethAmount = ethAmount;
	}
	public String getEthBalance() {
		return ethBalance;
	}
	public void setEthBalance(String ethBalance) {
		this.ethBalance = ethBalance;
	}
	
	
	
}
