package encapsulation;

public class Task2 {
	private double balance = 1000;
	
	public void setBalance(double deposit) {
		balance += deposit;
	}
	
	public double getBalance() {
		return balance;
	}
	
}
