package exceptionhandling;

public class Task1BankAccount {
	static int balance = 1000;
	public static void main(String[] args) {
		try {			
			withdrawAmount(1000);
		}catch(Task1InsufficientBalanceException t1) {
			System.out.println(t1.getMessage());
		}finally {
			System.out.println("from main finally");
		}
	}
	
	public static void withdrawAmount(int withdrawal) throws Task1InsufficientBalanceException{
		if(withdrawal < balance) {
			System.out.println("you can withdraw");
		}else {
			throw new Task1InsufficientBalanceException("less balance");
		}
	}
	
}

