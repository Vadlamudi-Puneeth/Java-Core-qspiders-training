package abstraction;

public class Task9Stripe implements Task9PaymentGateWay{
	
	@Override
	public void pay(double amount) {
		System.out.println(amount);
	}
	
	@Override
	public void refund(double amount) {
		System.out.println(amount);
	}
	
	@Override
	public void getTransactionStatus() {
		System.out.println("fail");
	}
	
}

