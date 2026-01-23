package week3;

public class Task1Car {
	
	private String brand;
	
	Task1Car(String brand){
		this.brand = brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	Task1Engine e = new Task1Engine();
	public Task1Engine getEngine() {
		return e;
	}
	
	Task1Car(){
		
	}
	
	
	
}
