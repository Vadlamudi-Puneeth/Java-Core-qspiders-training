package abstraction;

public class Task3Bike extends Task3Vehicle{
	@Override
	public void start() {
		System.out.println("bike started");
	}
	
	@Override
	public void stop() {
		System.out.println("bike stopped");
	}
	
	@Override
	public void getFuelType() {
		System.out.println("petrol");
	}
}
