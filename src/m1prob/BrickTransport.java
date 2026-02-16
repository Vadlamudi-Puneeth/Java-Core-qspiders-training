package m1prob;

public class BrickTransport extends GoodsTransport{
	private float brickSize;
	private int brickQuantity;
	private float brickPrice;
	
	public BrickTransport(){}
	
	public BrickTransport(String transportId, String transportDate, int transportRating, float brickSize, int brickQuantity, float brickPrice) {
		super(transportId, transportDate, transportRating);
		this.brickSize = brickSize;
		this.brickQuantity = brickQuantity;
		this.brickPrice = brickPrice;
	}
	public float getBrickSize() {
		return brickSize;
	}
	public void setBrickSize(float brickSize) {
		this.brickSize = brickSize;
	}
	public int getBrickQuantity() {
		return brickQuantity;
	}
	public void setBrickQuantity(int brickQuantity) {
		this.brickQuantity = brickQuantity;
	}
	public float getBrickPrice() {
		return brickPrice;
	}
	public void setBrickPrice(float brickPrice) {
		this.brickPrice = brickPrice;
	}
	
	public String vehicleSelection() {
		if(brickQuantity < 300) {
			return "Truck";
		}else if(brickQuantity >= 300 && brickQuantity <= 500) {
			return "Lorry";
		}else {
			return "Monster Lorry";
		}
	}
	
	public float calculateTotalCharge() {
		float vehiclePrice;
		if(vehicleSelection().equalsIgnoreCase("Truck")) {
			vehiclePrice = 1000f;
		}else if(vehicleSelection().equals("Lorry")) {
			vehiclePrice = 1700f;
		}else {
			vehiclePrice = 3000f;
		}
		
		int rating = super.getTransportRating();
		float discount = 0;
		if(rating == 5) {
			discount = 0.20f;
		}else if(rating == 4 || rating == 3) {
			discount = 0.10f;
		}
		
		float Price = brickPrice * brickQuantity;
		float Tax = Price * 0.3f;
		float Discount = Price * discount;
		float TotalCharge = ((Price) + vehiclePrice + Tax) - Discount;
		
		return TotalCharge;
		
	}
	
}
