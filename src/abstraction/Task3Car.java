package abstraction;

public class Task3Car extends Task3Vehicle{

	@Override
	public void start() {
		System.out.println("car started");
	}
	
	@Override
	public void stop() {
		System.out.println("car stopped");
	}
	
	@Override
	public void getFuelType() {
		System.out.println("diesel");
	}
}
