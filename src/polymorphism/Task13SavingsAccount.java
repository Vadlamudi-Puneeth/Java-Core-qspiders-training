package polymorphism;

public class Task13SavingsAccount extends Task13Account{
	double balance = 20000;
	static void bankName() {
		System.out.println("savings");
	}
	
	@Override
	public void calculateInterest(int years) {
		System.out.println(years);
	}
	
	
	public void calculateInterest(double rate) {
		System.out.println(rate);
	}
	
}

