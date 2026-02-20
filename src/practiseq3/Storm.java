package practiseq3;

public class Storm {
	private double windSpeed;
	private double rainfall;
	private String date;
	private String location;
	private String type;
	
	
	public Storm() {}


	public Storm(double windSpeed, double rainfall, String date, String location, String type) {
		super();
		this.windSpeed = windSpeed;
		this.rainfall = rainfall;
		this.date = date;
		this.location = location;
		this.type = type;
	}


	public double getWindSpeed() {
		return windSpeed;
	}


	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}


	public double getRainfall() {
		return rainfall;
	}


	public void setRainfall(double rainfall) {
		this.rainfall = rainfall;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Storm [windSpeed=" + windSpeed + ", rainfall=" + rainfall + ", date=" + date + ", location=" + location
				+ ", type=" + type + "]";
	}
	
	
	
	
}
