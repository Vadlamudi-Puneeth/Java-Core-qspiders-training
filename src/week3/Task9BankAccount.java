package week3;

public class Task9BankAccount {
	private int accNo;
	private Task9TransactionHistory hist;

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	Task9BankAccount(int accNo){
		this.accNo = accNo;
	}
	
	public void viewHistory() {
		hist = new Task9TransactionHistory(10);
	}
	
	public void showDetails() {
		System.out.println(accNo);
		System.out.println(hist.getNo());
	}
	
}
