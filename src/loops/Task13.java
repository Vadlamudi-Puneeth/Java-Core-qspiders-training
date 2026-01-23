package loops;
import java.util.*;

public class Task13 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int balance = sc.nextInt();
		while(balance != 0) {
			balance-=250;
		}
		System.out.println(balance);
	}
}
