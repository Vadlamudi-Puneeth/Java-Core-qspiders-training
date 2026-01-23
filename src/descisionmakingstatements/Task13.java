package descisionmakingstatements;
import java.util.*;

public class Task13 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		boolean sportsQuota = sc.nextBoolean();
		
		if(marks >= 90 && sportsQuota) {
			System.out.println("Tier-1 seat");
		}else if(marks >= 90) {
			System.out.println("Tier-2 seat");
		}else if(marks >= 75) {
			System.out.println("Tier-3 seat");
		}else {
			System.out.println("fail");
		}
		
		
	}
}
