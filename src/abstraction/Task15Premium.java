package abstraction;

public class Task15Premium extends Task15Subscription{
	@Override
	public void activate() {
		System.out.println("activated");
	}
	
	@Override
	public void deactivate() {
		System.out.println("deactivated");
	}
	
	@Override
	public void calculateMonthlyCost() {
		System.out.println(1000);
	}
}
