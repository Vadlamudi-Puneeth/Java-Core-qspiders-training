package polymorphism;

public class Task7CarRide extends Task7Ride{
	@Override
	public int calculateFare(int distance) {
		return (distance*20);
	}
}
