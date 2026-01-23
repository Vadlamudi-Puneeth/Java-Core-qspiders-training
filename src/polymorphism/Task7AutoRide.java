package polymorphism;

public class Task7AutoRide extends Task7Ride{
	@Override
	public int calculateFare(int distance) {
		return (distance*15);
	}
}
