package abstraction;

public class Task9Main {
	public static void main(String[] args) {
		Task9PaymentGateWay t9;
		t9 = new Task9Paypal();
		t9.pay(10000);
		t9.refund(2000);
		t9.getTransactionStatus();
		t9 = new Task9Stripe();
		t9.pay(10000);
		t9.refund(2000);
		t9.getTransactionStatus();
	}
}
