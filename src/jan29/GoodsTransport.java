package jan29;

public abstract class GoodsTransport {
	protected String transportId;
	protected String transportdate;
	protected int transportRating;
	
	public GoodsTransport(String transportId, String transportdate, int transportRating) {
		this.transportId = transportId;
		this.transportdate = transportdate;
		this.transportRating = transportRating;
	}
	
	public String getTransportId() {
		return transportId;
	}
	
	public void setTransportId(String transportId) {
		this.transportId = transportId;
	}
	
	public String getTransportdate() {
		return transportdate;
	}
	
	public void setTransportdate(String transportdate) {
		this.transportdate = transportdate;
	}
	
	public int getTransportRating() {
		return transportRating;
	}
	
	public void setTransportRating(int transportRating) {
		this.transportRating = transportRating;
	}
	
	abstract public String vehicleSelection();
	abstract public float calculateTotalCharge();
	
}
