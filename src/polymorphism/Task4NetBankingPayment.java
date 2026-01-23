package polymorphism;

public class Task4NetBankingPayment extends Task4Payment{
	@Override
	public void processPayment(double payment) {
		System.out.println(payment);
	}
}
