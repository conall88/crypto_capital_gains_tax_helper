package crypto.thing;
/*
 * 
Timestamp,Type,BTC,Subtotal,Fees,Total,Currency,Price Per Coin,Payment Method,ID,Share
2014-03-07 06:39:03 -0800,Buy,0.25,160.06,1.75,161.81,USD,640.24,Bankname,5319someid137,""
 */

public class Coinbaseentry {

	private String timestamp;
	private String type;
	private double amount;
	private double subtotal;
	private double fees;
	private double total;
	private String currency;
	private double pricePerCoin;
	private String paymentMethod;
	private String id;
	private String share;
	
	public Coinbaseentry(String timestamp, String type, double amount, double subtotal, double fees, double total,
			String currency, double pricePerCoin, String paymentMethod, String id, String share) {
		super();
		this.timestamp = timestamp;
		this.type = type;
		this.amount = amount;
		this.subtotal = subtotal;
		this.fees = fees;
		this.total = total;
		this.currency = currency;
		this.pricePerCoin = pricePerCoin;
		this.paymentMethod = paymentMethod;
		this.id = id;
		this.share = share;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getPricePerCoin() {
		return pricePerCoin;
	}

	public void setPricePerCoin(double pricePerCoin) {
		this.pricePerCoin = pricePerCoin;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getShare() {
		return share;
	}

	public void setShare(String share) {
		this.share = share;
	}
	
	
	
}
