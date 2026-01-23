package inheritance;

public class Task7SavingsAccount extends Task7Account{
	double interest;
	Task7SavingsAccount(long acc_no, double balance, double interest){
		super(acc_no, balance);
		this.interest = interest;
	}
	
	public void displaySavingsAccount() {
		super.displayAccount();
		System.out.println(interest);
	}
}
