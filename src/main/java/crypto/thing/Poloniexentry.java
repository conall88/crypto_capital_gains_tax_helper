package crypto.thing;
/*
 * 
Date,               Market, Category,Type,Price,     Amount,      Total,     Fee,  Order Number,Base Total Less Fee,Quote Total Less Fee
2017-09-16 20:12:29,OMG/ETH,Exchange,Sell,0.03939000,122.16305030,4.81200255,0.15%,375529292,   4.80478455,         -122.16305030
 */

public class Poloniexentry {

	private String timestamp;
	private String market;
	private String category;
	private String type;
	private double price;
	private double amount;
	private double total;
	private String fee;
	private String orderNumber;
	private double baseTotalLessFee;
	private double quoteTotalLessFee;
	
	public Poloniexentry(String timestamp, String market, String category, String type, double price, double amount, double total, String fee, String orderNumber, double baseTotalLessFee, double quoteTotalLessFee) {
		super();
		this.timestamp = timestamp;
		this.market = market;
		this.category = category;
		this.type = type;
		this.price = price;
		this.amount = amount;
		this.total = total;
		this.fee = fee;
		this.orderNumber = orderNumber;
		this.baseTotalLessFee = baseTotalLessFee;
		this.quoteTotalLessFee = quoteTotalLessFee;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public double getBaseTotalLessFee() {
		return baseTotalLessFee;
	}

	public void setBaseTotalLessFee(double baseTotalLessFee) {
		this.baseTotalLessFee = baseTotalLessFee;
	}

	public double getQuoteTotalLessFee() {
		return quoteTotalLessFee;
	}

	public void setQuoteTotalLessFee(double quoteTotalLessFee) {
		this.quoteTotalLessFee = quoteTotalLessFee;
	}
	
	
}
