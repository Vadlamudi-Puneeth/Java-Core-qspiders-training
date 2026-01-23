package polymorphism;

public class Task4Main {
	public static void main(String args[]) {
		Task4Payment payments[] = new Task4Payment[3];
		
		payments[0] = new Task4CreditCardPayment();
		payments[1] = new Task4UpiPayment();
		payments[2] = new Task4NetBankingPayment();
		
		double amount[] = {10000, 20000, 30000};
		
		for(int i = 0;i < amount.length; i++) {
			payments[i].processPayment(amount[i]);
		}
		
	}
}
