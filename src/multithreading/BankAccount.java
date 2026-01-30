package multithreading;

public class BankAccount {
	
	int balance = 1500;
	
	synchronized void withdraw(int amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println("Remaining balance: " + balance);
		}else {
			System.out.println("Insufficient balance");
		}
	}
	
}
