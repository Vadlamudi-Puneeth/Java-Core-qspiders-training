package polymorphism;

public class Task4UpiPayment extends Task4Payment{
	@Override
	public void processPayment(double payment) {
		System.out.println(payment);
	}
}	
