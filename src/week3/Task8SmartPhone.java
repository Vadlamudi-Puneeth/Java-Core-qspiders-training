package week3;

public class Task8SmartPhone {
	String brand;
	private Task8Sim sim;
	
	Task8SmartPhone(String brand){
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void createObj() {
		sim = new Task8Sim("airtel");
	}
	
	public void showDetails() {
		System.out.println(brand);
		System.out.println(sim.getType());
	}
	
	
}
