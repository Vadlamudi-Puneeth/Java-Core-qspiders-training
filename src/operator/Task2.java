package operator;

public class Task2 {
	public static void main(String args[]) {
		int balance = 0;
		boolean activeStatus = true;
		
		String access = (balance > 0 && activeStatus == true) ? "Allow Access" : "Denied Access";
		System.out.println(access + " to withdraw");
		
		int withdrawl = 200;
		int finalBalance = (access.equals("Allow Access")) ? (balance - withdrawl) : -1;
		
		System.out.println(finalBalance);
		
	}
}
