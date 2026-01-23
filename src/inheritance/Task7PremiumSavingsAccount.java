package inheritance;

public class Task7PremiumSavingsAccount extends Task7SavingsAccount{
	int extra_benefits = 1000;
	Task7PremiumSavingsAccount(long acc_no, double balance, double interest){
		super(acc_no, balance, interest);
	}
	
	public void display() {
		super.displaySavingsAccount();
		System.out.println(extra_benefits);
	}
}
