package encapsulation;

public class Task8 {
	private int balance = 15000;
	
	public void setBalance(int deposit) {
		if(deposit > 0 && balance >= 15000) {
			balance-=deposit;
		}
	}
	
	public int getBalance() {
		return balance;
	}
	
}
