package abstraction;

public class Task6Savings extends Task6BankAccount{
	
	@Override
	public void deposit(double amount) {
		System.out.println(amount);
	}
	
	public void calculateInterest() { // this is not abstract method we no need to overload it but we want to use that's y we are implementing this here
		
		System.out.println("calcualte");
	}
	
	@Override
	public void withdraw(double amount) {
		System.out.println(amount);
		
	}
}
