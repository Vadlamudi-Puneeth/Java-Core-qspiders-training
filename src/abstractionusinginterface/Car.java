package abstractionusinginterface;

public abstract class Car {
	boolean isSedan ;
	int seats ;
	
	Car(boolean isSedan,int seats){
		this.isSedan = isSedan;
		this.seats = seats;
	}
		
	abstract int getMileage();
	
	void getIsSedan() {
		System.out.println("is sedan: " + isSedan);
	}
	
	void getSeats() {
		System.out.println("no of seats: " + seats);
	}
	
}
