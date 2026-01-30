package multithreading;

public class ByeUser extends Thread{
	
	BankAccount acc;
	
	ByeUser(BankAccount acc){
		this.acc = acc;
	}
	
	@Override
	public void run() {
		acc.withdraw(1100);
		System.out.println("from byee user run");
	}
	
}
