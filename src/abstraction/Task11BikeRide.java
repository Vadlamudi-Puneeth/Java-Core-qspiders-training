package abstraction;

public class Task11BikeRide extends Task11Ride{

	@Override
	public void acceptRide() {
		System.out.println("ride accepted");
	}
	
	@Override
	public void cancelRide() {
		System.out.println("ride cancel");
	}
	
	@Override
	public void calculateFare() {
		System.out.println(20);
	}
}
