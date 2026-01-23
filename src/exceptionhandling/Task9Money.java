package exceptionhandling;

public class Task9Money {
	static int balance = 1000;
	static boolean beneficiary = true;
	static boolean NetWorkFailure = false;
	
	public static void main(String[] args) {
		try{
			transfer(200);
		}catch(Task9Invalidbeneficiary i) {
			System.out.println(i.getMessage());
		}catch(Task9InsufficientBalance ib) {
			System.out.println(ib.getMessage());
		}catch(Task9NetworkFailure n) {
			System.out.println(n.getMessage());
		}
	}
	
	public static void transfer(int withdraw) throws Task9InsufficientBalance, Task9Invalidbeneficiary, Task9NetworkFailure{
		if(withdraw < balance && !NetWorkFailure && beneficiary) {
			System.out.println("money successfully transferred");
		}else if(balance < withdraw) {
			throw new Task9InsufficientBalance("less balance");
		}else if(NetWorkFailure) {
			throw new Task9NetworkFailure("newtwork failure");
		}else if(!beneficiary) {
			throw new Task9Invalidbeneficiary("incalid beneficiary");
		}
	}
	
}
