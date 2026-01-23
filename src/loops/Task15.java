package loops;
import java.util.*;

public class Task15 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int attempts = 0;
		int otp = 1234;
		int currentOtp = sc.nextInt();
		while(attempts < 3 && currentOtp != otp) {
			currentOtp = sc.nextInt();
			attempts++;
		}
		
		System.out.println(attempts);
		
	}
}
