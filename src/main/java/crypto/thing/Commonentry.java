package crypto.thing;

public class Commonentry implements java.lang.Comparable<Commonentry> {

	private long timestamp;
	private String timestampHr;
	private String fromUnits;
	private double fromAmount;
	private String toUnits;
	private double toAmount;
	private double toPerFrom;
	private String exchangeName;
	private double btcAmount;
	private double btcPriceInUsd;
	private double usdTotal;
	private String usdDerivationMethod;
	private String btcDerivationMethod;
	private double feeInUsd;
	private double costBasisPerUnit;
	private boolean income;
	
	private double btcShortterm;
	private double btcLongterm;
	private double ethShortterm;
	private double ethLongterm;
	private double zecShortterm;
	private double zecLongterm;
	private double omgShortterm;
	private double omgLongterm;
	private double etcShortterm;
	private double etcLongterm;
	private double repShortterm;
	private double repLongterm;
	private double daoShortterm;
	private double daoLongterm;
	
	public Commonentry() {
		super();
		this.income = false;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getTimestampHr() {
		return timestampHr;
	}

	public void setTimestampHr(String timestampHr) {
		this.timestampHr = timestampHr;
	}

	public String getFromUnits() {
		return fromUnits;
	}

	public void setFromUnits(String fromUnits) {
		this.fromUnits = fromUnits;
	}

	public double getFromAmount() {
		return fromAmount;
	}

	public void setFromAmount(double fromAmount) {
		this.fromAmount = fromAmount;
	}

	public String getToUnits() {
		return toUnits;
	}

	public void setToUnits(String toUnits) {
		this.toUnits = toUnits;
	}

	public double getToAmount() {
		return toAmount;
	}

	public void setToAmount(double toAmount) {
		this.toAmount = toAmount;
	}

	public double getToPerFrom() {
		return toPerFrom;
	}

	public void setToPerFrom(double toPerFrom) {
		this.toPerFrom = toPerFrom;
	}

	public String getExchangeName() {
		return exchangeName;
	}

	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}

	public double getBtcAmount() {
		return btcAmount;
	}

	public void setBtcAmount(double btcAmount) {
		this.btcAmount = btcAmount;
	}

	public double getBtcPriceInUsd() {
		return btcPriceInUsd;
	}

	public double getUsdTotal() {
		return usdTotal;
	}

	public void setUsdTotal(double usdTotal) {
		this.usdTotal = usdTotal;
	}

	public void setBtcPriceInUsd(double btcPriceInUsd) {
		this.btcPriceInUsd = btcPriceInUsd;
	}

	public String getUsdDerivationMethod() {
		return usdDerivationMethod;
	}

	public void setUsdDerivationMethod(String usdDerivationMethod) {
		this.usdDerivationMethod = usdDerivationMethod;
	}

	public String getBtcDerivationMethod() {
		return btcDerivationMethod;
	}

	public void setBtcDerivationMethod(String btcDerivationMethod) {
		this.btcDerivationMethod = btcDerivationMethod;
	}

	public double getFeeInUsd() {
		return feeInUsd;
	}

	public void setFeeInUsd(double feeInUsd) {
		this.feeInUsd = feeInUsd;
	}

	public double getBtcShortterm() {
		return btcShortterm;
	}

	public void setBtcShortterm(double btcShortterm) {
		this.btcShortterm = btcShortterm;
	}

	public double getBtcLongterm() {
		return btcLongterm;
	}

	public void setBtcLongterm(double btcLongterm) {
		this.btcLongterm = btcLongterm;
	}

	public double getEthShortterm() {
		return ethShortterm;
	}

	public void setEthShortterm(double ethShortterm) {
		this.ethShortterm = ethShortterm;
	}

	public double getEthLongterm() {
		return ethLongterm;
	}

	public void setEthLongterm(double ethLongterm) {
		this.ethLongterm = ethLongterm;
	}

	public double getZecShortterm() {
		return zecShortterm;
	}

	public void setZecShortterm(double zecShortterm) {
		this.zecShortterm = zecShortterm;
	}

	public double getZecLongterm() {
		return zecLongterm;
	}

	public void setZecLongterm(double zecLongterm) {
		this.zecLongterm = zecLongterm;
	}

	public double getOmgShortterm() {
		return omgShortterm;
	}

	public void setOmgShortterm(double omgShortterm) {
		this.omgShortterm = omgShortterm;
	}

	public double getOmgLongterm() {
		return omgLongterm;
	}

	public void setOmgLongterm(double omgLongterm) {
		this.omgLongterm = omgLongterm;
	}

	public double getEtcShortterm() {
		return etcShortterm;
	}

	public void setEtcShortterm(double etcShortterm) {
		this.etcShortterm = etcShortterm;
	}

	public double getEtcLongterm() {
		return etcLongterm;
	}

	public void setEtcLongterm(double etcLongterm) {
		this.etcLongterm = etcLongterm;
	}

	public double getRepShortterm() {
		return repShortterm;
	}

	public void setRepShortterm(double repShortterm) {
		this.repShortterm = repShortterm;
	}

	public double getRepLongterm() {
		return repLongterm;
	}

	public void setRepLongterm(double repLongterm) {
		this.repLongterm = repLongterm;
	}

	public double getDaoShortterm() {
		return daoShortterm;
	}

	public void setDaoShortterm(double daoShortterm) {
		this.daoShortterm = daoShortterm;
	}

	public double getDaoLongterm() {
		return daoLongterm;
	}

	public void setDaoLongterm(double daoLongterm) {
		this.daoLongterm = daoLongterm;
	}

	public double getCostBasisPerUnit() {
		return costBasisPerUnit;
	}

	public void setCostBasisPerUnit(double costBasisPerUnit) {
		this.costBasisPerUnit = costBasisPerUnit;
	}

	public boolean isIncome() {
		return income;
	}

	public void setIncome(boolean income) {
		this.income = income;
	}

	@Override
	public int compareTo(Commonentry o) // this allows us to order entries in a collection
	{
	    Long othertimestamp = ((Commonentry)o).getTimestamp();
	    int x = othertimestamp.compareTo(getTimestamp());
	    if(x >= 0) // this is to prevent equals
	    	return -1;
	    else
	    	return 1;
	}
	
}
