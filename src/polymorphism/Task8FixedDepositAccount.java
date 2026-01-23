package polymorphism;

public class Task8FixedDepositAccount extends Task8Account{
	
	public void getMaturityAccount() {
		System.out.println("mature");
	}
	
	@Override
	public void calculateInterest() {
		System.out.println(10);
	}
}
