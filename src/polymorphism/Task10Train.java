package polymorphism;

public class Task10Train extends Task10Transport{
	@Override
	public void bookTicket() {
		System.out.println("ticket booked");
	}
	
	@Override
	public void calculateFare() {
		System.out.println(3000);
	}
}
