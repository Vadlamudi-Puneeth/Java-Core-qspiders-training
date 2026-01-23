package polymorphism;

public class Task8Main {
	public static void main(String rgs[]) {
		Task8Account account[] = new Task8Account[2] ;		
		
		account[0] = new Task8SavingsAccount();
		account[1] = new Task8FixedDepositAccount();
		
		for(Task8Account acc: account) {
			acc.calculateInterest();
			
			if(acc instanceof Task8FixedDepositAccount) {
				Task8FixedDepositAccount t8 = (Task8FixedDepositAccount)acc;
				t8.getMaturityAccount();
			}
			
		}
		
	}
}
