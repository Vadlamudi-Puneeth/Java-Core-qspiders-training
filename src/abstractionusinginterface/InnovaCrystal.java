package abstractionusinginterface;

public class InnovaCrystal extends Car{
	
	InnovaCrystal(){
		super(true,7);
	}
	int dist = 10;
	int fuel = 2; // litres
	int mileage = 0;
	public int getMileage() {
		mileage = dist / fuel;
		return mileage;
	}
	
	public static void main(String args[]) {
		InnovaCrystal i = new InnovaCrystal();
		System.out.println("Mileage of InnovaCrystal is: " + i.getMileage());
		i.getIsSedan();
		i.getSeats();
	}
}
