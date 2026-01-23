package abstraction;

public class Task6Main {
	public static void main(String[] args) {
		Task6BankAccount t6;
		t6 = new Task6Savings();
		t6.calculateInterest();
		t6.deposit(1000);
		t6.withdraw(10000);
		t6 = new Task6Current();
		t6.calculateInterest();
		t6.deposit(1000);
		t6.withdraw(10000);
	}
}
