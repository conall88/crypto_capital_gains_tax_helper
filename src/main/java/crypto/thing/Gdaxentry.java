package crypto.thing;
/*
 * 
trade id,product,side,created at,size,size unit,price,fee,total,price/fee/total unit
5234197,ETH-USD,SELL,2017-06-02T19:33:41.729Z,8.88953395,ETH,217.99,5.8134885172815,1932.0160172432185,USD
 */

public class Gdaxentry {

	private String tradeId;
	private String product;
	private String side;
	private String createdAt;
	private double size;
	private String sizeUnit;
	private double price;
	private double fee;
	private double total;
	private String priceFeeTotalUnit;
	
	public Gdaxentry(String tradeId, String product, String side, String createdAt, double size, String sizeUnit, double price, double fee, double total, String priceFeeTotalUnit) {
		super();
		this.tradeId = tradeId;
		this.product = product;
		this.side = side;
		this.createdAt = createdAt;
		this.size = size;
		this.sizeUnit = sizeUnit;
		this.price = price;
		this.fee = fee;
		this.total = total;
		this.priceFeeTotalUnit = priceFeeTotalUnit;
	}
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getSide() {
		return side;
	}
	public void setSide(String side) {
		this.side = side;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public String getSizeUnit() {
		return sizeUnit;
	}
	public void setSizeUnit(String sizeUnit) {
		this.sizeUnit = sizeUnit;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getPriceFeeTotalUnit() {
		return priceFeeTotalUnit;
	}
	public void setPriceFeeTotalUnit(String priceFeeTotalUnit) {
		this.priceFeeTotalUnit = priceFeeTotalUnit;
	}
	
	
	
}
