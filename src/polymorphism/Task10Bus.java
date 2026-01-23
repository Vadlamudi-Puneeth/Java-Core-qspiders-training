package polymorphism;

public class Task10Bus extends Task10Transport{
	
	@Override
	public void bookTicket() {
		System.out.println("ticket booked");
	}
	
	@Override
	public void calculateFare() {
		System.out.println(1000);
	}
}
