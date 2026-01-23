package polymorphism;

public class Task4CreditCardPayment extends Task4Payment{

	@Override
	public void processPayment(double payment) {
		System.out.println(payment);
	}
}
