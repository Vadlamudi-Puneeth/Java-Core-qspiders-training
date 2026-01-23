package inheritance;

public class Task4Car extends Task4Vehicle{
	int num_of_doors;
	String BrandName;
	
	Task4Car(int speed, String FuelType, int num_of_doors, String BrandName){
		super(speed, FuelType);
		this.num_of_doors = num_of_doors;
		this.BrandName = BrandName;
	}
	
	void display() {
		super.displayVehicle();
		System.out.println(num_of_doors);
		System.out.println(BrandName);
	}

}
