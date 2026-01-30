package jan29;

public class TimberTransport extends GoodsTransport{
	float timberLength;
	float timberRadius;
	String timberType;
	float timberPrice;
	
	
	
	public TimberTransport(String transportId, String transportdate, int transportRating, float timberLength, float timberRadius, String timberType, float timberPrice) {
		super(transportId, transportdate, transportRating);
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
	public float getTimerRadius() {
		return timberRadius;
	}
	public void setTimerRadius(float timerRadius) {
		this.timberRadius = timerRadius;
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
	
	@Override
	public String vehicleSelection() {
		float Area = 3.147f * timberRadius * timberLength;
		if(Area <= 250) {
			return "Truck";
		}else if(Area >= 250 && Area <= 400) {
			return "Lorry";
		}else {
			return "MonsterLorry";
		}
	}
	
	@Override
	public float calculateTotalCharge() {
		float Volume = 3.147f * timberRadius * timberRadius * timberLength;
		
		int rating = getTransportRating();
		
		float discountPercent = 0.0f;
		 if (rating == 5) discountPercent = 0.20f;
		 else if (rating == 3 || rating == 4) discountPercent = 0.10f;
		 
		 float Rate;
	        if (timberType.equalsIgnoreCase("Premium")) Rate = 0.25f;
	        else Rate = 0.15f;
		
		float Price = Volume * timberPrice * Rate;
		float tax = Price * 0.3f;
		
		float discount = Price * discountPercent;

        float vehiclePrice = 0;
        String vehicle = vehicleSelection();

        if (vehicle.equalsIgnoreCase("Truck")) vehiclePrice = 1000;
        else if (vehicle.equalsIgnoreCase("Lorry")) vehiclePrice = 1700;
        else vehiclePrice = 3000;

        return (Price + vehiclePrice + tax) - discount;
		
	}
	
}
