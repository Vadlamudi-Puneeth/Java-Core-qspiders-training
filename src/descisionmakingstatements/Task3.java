package descisionmakingstatements;
import java.util.Scanner;

public class Task3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n < 0) {
			System.out.println("Negative number");
		}else if(n == 0) {
			System.out.println("Equal to 0");
		}else {
			System.out.println("Positive number");
		}
		
	}
}
