package m1prob;

public class TimberTransport extends GoodsTransport{
	private float timberLength;
	private float timberRadius;
	private String timberType;
	private float timberPrice;
	
	public TimberTransport() {}
	


	public TimberTransport(String transportId, String transportDate, int transportRating, float timberLength, float timberRadius, String timberType, float timberPrice) {
		super(transportId, transportDate, transportRating);
		this.timberLength = timberLength;
		this.timberRadius = timberRadius;
		this.timberType = timberType;
		this.timberPrice = timberPrice;
	}



	public float getTimberLength() {
		return timberLength;
	}
	public void setTimberLength(float timberLength) {
		this.timberLength = timberLength;
	}
	public float getTimberRadius() {
		return timberRadius;
	}
	public void setTimberRadius(float timberRadius) {
		this.timberRadius = timberRadius;
	}
	public String getTimberType() {
		return timberType;
	}
	public void setTimberType(String timberType) {
		this.timberType = timberType;
	}
	public float getTimberPrice() {
		return timberPrice;
	}
	public void setTimberPrice(float timberPrice) {
		this.timberPrice = timberPrice;
	}
	
	public String vehicleSelection() {
		float Area = 2 * 3.147f * timberRadius * timberLength;
		
		if(Area < 250) {
			return "Truck";
		}else if(Area >= 250 && Area <= 400) {
			return "Lorry";
		}else {
			return "Monster Lorry";
		}
	}
	
	public float calculateTotalCharge() {
		float vehiclePrice = 0;
		if(vehicleSelection().equalsIgnoreCase("truck")) {
			vehiclePrice = 1000f;
		}else if(vehicleSelection().equalsIgnoreCase("Lorry")) {
			vehiclePrice = 1700f;
		}else {
			vehiclePrice = 3000f;
		}
		
		int rating = super.getTransportRating();
		
		float discount = 0;
		if(rating == 5) {
			discount = 0.20f;
		}else if(rating == 3 || rating == 4) {
			discount = 0.10f;
		}
		
		float Volume = 3.147f * timberRadius * timberLength * timberRadius;
		float timberTypeRating;
		
		if(timberType.equals("Premium")) {
			timberTypeRating = 0.25f;
		}else {
			timberTypeRating = 0.15f;
		}
		
		float Price = Volume * timberPrice * timberTypeRating;
		float Tax = Price * 0.3f;
		float Discount = Price * discount;
		
		float Total = ((Price) + vehiclePrice + Tax) - Discount;
		return Total;
		
	}
	
	
}
