package inheritance;

public class Task2SavingsAccount extends Task2Account{
	double interest = 0;
	int priniciple = 0;
	double time = 0;
	double rateOfInterest = 0; 
	
	Task2SavingsAccount(double time, int interest, double rateOfInterest, long acc_no, double balance){
		super(acc_no, balance);
		this.interest = interest;
		this.time = time;
		this.rateOfInterest = rateOfInterest;
	}
	void display() {
		interest = (balance * time * rateOfInterest) / 100;
		System.out.println(interest);
	}
	

}
