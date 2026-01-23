package methods;
import java.util.*;

public class Task4 {
	
	public static void updatedBalance(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int balance = sc.nextInt();
		int deposit = sc.nextInt();
		updatedBalance(balance, deposit);
	}
}
