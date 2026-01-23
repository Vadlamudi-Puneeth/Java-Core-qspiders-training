package inheritance;

public class Task4Vehicle {
	int speed;
	String FuelType;
	
	Task4Vehicle(int speed, String FuelType){
		this.speed = speed;
		this.FuelType = FuelType;
	}
	
	public void displayVehicle() {
		System.out.println(speed);
		System.out.println(FuelType);
	}
	
}
