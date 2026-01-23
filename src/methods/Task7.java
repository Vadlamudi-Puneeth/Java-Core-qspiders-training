package methods;
import java.util.*;

public class Task7 {
	
	public static void updatedBalance(int balance, int withdrawal) {
		int updated = balance;
		if(balance >= withdrawal) {
			updated = updated - withdrawal;
		}else {
			System.out.println("Low balance");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int balance = 50000;
		int withdrawal = 20000;
		
		updatedBalance(balance, withdrawal);
		
	}
}
