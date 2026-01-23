package abstraction;

public class Task16MainWithGps extends Task16Vehicle implements Task16GPSCapable{
	
	@Override
	public void calculateMileage() {
		System.out.println(1000);
	}
	
	@Override
	public void navigate() {
		System.out.println("navigate");
	}
	
	@Override
	public void getCurrentLocation() {
		System.out.println("kvl");
	}
	
}
