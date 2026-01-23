package abstraction;

public class Task13Doctor extends Task13Staff{
	@Override
	public void checkIn() {
		System.out.println("check in");
	}
	
	@Override
	public void checkOut() {
		System.out.println("check out");
	}
	
	@Override
	public void calculateDutyHours() {
		System.out.println(10);
	}
}
