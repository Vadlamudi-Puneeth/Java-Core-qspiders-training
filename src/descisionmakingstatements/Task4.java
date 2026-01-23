package descisionmakingstatements;
import java.util.*;

public class Task4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n % 5 == 0 && n % 3 == 0) {
			System.out.println("Divisible by both 5 and 3");
		}else {
			System.out.println("Not divisible by both 5 and 3");
		}
		
	}
}
