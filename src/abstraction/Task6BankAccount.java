package abstraction;

public abstract class Task6BankAccount {
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	public void calculateInterest() {
		System.out.println("calculated");
	}
}
