package abstraction;

public class Task6Current extends Task6BankAccount{

	@Override
	public void deposit(double amount) {
		System.out.println(amount);
	}
	
	public void calculateInterest() {
		System.out.println("calculated");
	}
	
	@Override
	public void withdraw(double amount) {
		System.out.println(amount);
	}
	
}
