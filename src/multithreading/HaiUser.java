package multithreading;

public class HaiUser extends Thread{
	
	BankAccount acc;
	
	HaiUser(BankAccount acc){
		this.acc = acc;
	}
	
	@Override
	public void run() {
		acc.withdraw(1000);
		System.out.println("from hai user run");
	}
	
}
