package inheritance;

public class Task7Account {
	long acc_no;
	double balance;
	
	Task7Account(long acc_no, double balance){
		this.acc_no = acc_no;
		this.balance = balance;
	}
	
	public void displayAccount() {
		System.out.println(acc_no);
		System.out.println(balance);
	}
	
}
