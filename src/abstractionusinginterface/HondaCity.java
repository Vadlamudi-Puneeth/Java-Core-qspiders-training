package abstractionusinginterface;

public class HondaCity extends Car{
	
	HondaCity(){
		super(true,5);
	}
	
	int dist = 10;
	int fuel = 2; // litres
	int mileage = 0;
	
	public int getMileage() {
		mileage = dist / fuel;
		return mileage;
	}
	
	public static void main(String args[]) {
		HondaCity h = new HondaCity();
		System.out.println("Mileage of HondaCity is: " + h.getMileage());
		h.getIsSedan();
		h.getSeats();
	}
}
