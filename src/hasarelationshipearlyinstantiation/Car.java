package hasarelationshipearlyinstantiation;

public class Car {
	private String brand;
	private Engine e;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	Car(String brand,Engine e){
		this.brand = brand;
		this.e = e;
	}
	
	Car(){
		
	}
//	private Engine e = new Engine();
//	
	public Engine getEngine() {
		return e;
	}
	
	
	
}
