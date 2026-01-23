package descisionmakingstatements;
import java.util.*;

public class Task9 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int marks = sc.nextInt();
		double income = sc.nextDouble();
		
		if(marks >= 85 && income <= 300000) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}
}
