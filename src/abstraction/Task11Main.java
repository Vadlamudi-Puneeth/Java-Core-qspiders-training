package abstraction;

public class Task11Main {
	public static void main(String[] args) {
		Task11Ride t11;
		t11 = new Task11CarRide();
		t11.acceptRide();
		t11.cancelRide();
		t11.calculateFare();
		t11 = new Task11BikeRide();
		t11.acceptRide();
		t11.cancelRide();
		t11.calculateFare();
	}
}
