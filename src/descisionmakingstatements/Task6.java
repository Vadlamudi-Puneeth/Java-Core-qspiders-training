package descisionmakingstatements;
import java.util.*;

public class Task6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		if(n >= 10 && n <= 20) {
			System.out.println("Number is in between 10 and 20");
		}else {
			System.out.println("Number is not in between 10 and 20");
		}
		
	}
}
