package polymorphism;

public class Task7BikeRide extends Task7Ride{
	
	
	@Override
	public int calculateFare(int distance) {
		return distance * 10;
	}
	
}
