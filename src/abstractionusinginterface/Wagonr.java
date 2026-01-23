package abstractionusinginterface;

public class Wagonr extends Car{
	//Mileage = Distance Traveled / Fuel Consumed
	
	Wagonr(){
		super(false,4);
	}
	
	int dist = 10;
	int fuel = 2; // litres
	int mileage = 0;
	public int getMileage() {
		mileage = dist / fuel;
		return mileage;
	}
	
	public static void main(String args[]) {
		Wagonr w = new Wagonr();
		System.out.println("Mileage of Wagonr is: " + w.getMileage());
		w.getIsSedan();
		w.getSeats();
	}
}
