package loops;
import java.util.*;

public class Task10 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n <= 0) {
			System.out.println("Please Enter positive only");
			n = sc.nextInt();
		}
		System.out.println(n + " is positive");
	}
}
