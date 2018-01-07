package crypto.thing;

public class Chunk implements java.lang.Comparable<Chunk> {

	private long timestamp;
	private String timestampHr;
	private String units;
	private double quantity;
	private double costBasisPerUnit;
	
	public Chunk() {
		super();
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



	public String getUnits() {
		return units;
	}



	public void setUnits(String units) {
		this.units = units;
	}



	public double getQuantity() {
		return quantity;
	}



	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}



	public double getCostBasisPerUnit() {
		return costBasisPerUnit;
	}



	public void setCostBasisPerUnit(double costBasisPerUnit) {
		this.costBasisPerUnit = costBasisPerUnit;
	}



	@Override
	public int compareTo(Chunk o) // this allows us to order entries in a collection
	{
	    Long othertimestamp = ((Chunk)o).getTimestamp();
	    int x = othertimestamp.compareTo(getTimestamp());
	    if(x >= 0) // this is to prevent equals
	    	return -1;
	    else
	    	return 1;
	}
	
}
