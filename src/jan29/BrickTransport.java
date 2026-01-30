package jan29;

public class BrickTransport extends GoodsTransport{
	private float brickSize;
	private int brickQuantity;
	private float brickPrice;
	
	public BrickTransport(String transportId, String transportdate, int transportRating, float brickSize,int brickQuantity, float brickPrice) {
		super(transportId, transportdate, transportRating);
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
	public float getBrickPrice() {
		return brickPrice;
	}
	public void setBrickPrice(float brickPrice) {
		this.brickPrice = brickPrice;
	}
	public int getBrickQuantity() {
		return brickQuantity;
	}
	public void setBrickQuantity(int brickQuantity) {
		this.brickQuantity = brickQuantity;
	}
	
	@Override
	public String vehicleSelection() {
		if(brickQuantity < 300) {
			return "Truck";
		}else if(brickQuantity >= 300 && brickQuantity <= 500) {
			return "Lorry";
		}else if(brickQuantity > 500){			
			return "MonsterLorry";
		}
		return null;
	}
	
	@Override
	public float calculateTotalCharge() {
		
		int rating = getTransportRating();
		
		float price = brickPrice * brickQuantity;
		float tax = price * 0.3f;
		
		float discountPercentage = 0.0f;
		
		if(rating == 5) {
			discountPercentage = 0.20f;
		}else if(rating == 3 || rating == 4) {
			discountPercentage = 0.10f;
		}
		
		float discount = price * discountPercentage;
		
		float vehiclePrice = 0;
		
		 String vehicle = vehicleSelection();

	        if (vehicle.equalsIgnoreCase("Truck")) vehiclePrice = 1000;
	        else if (vehicle.equalsIgnoreCase("Lorry")) vehiclePrice = 1700;
	        else vehiclePrice = 3000;

	        return (price + vehiclePrice + tax) - discount;
	}
	
}
