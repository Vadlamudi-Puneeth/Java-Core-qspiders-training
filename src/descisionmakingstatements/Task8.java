package descisionmakingstatements;
import java.util.*;

public class Task8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double balance = sc.nextDouble();
		double withdrawal = sc.nextDouble();
		
		if(balance >= withdrawal && withdrawal % 100 == 0) {
			System.out.println("you are able to withdraw");
		}else {
			System.out.println("you are not able to withdraw");
		}
		
	}
}
