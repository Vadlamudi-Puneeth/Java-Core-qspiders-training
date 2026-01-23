package descisionmakingstatements;
import java.util.*;

public class Task12 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		if(age < 12) {
			System.out.println("child have to pay 100rs");
		}else if(age >= 12 && age <= 60) {
			System.out.println("adult have to pay 200rs");
		}else if(age > 60) {
			System.out.println("senior have to pay 150rs");
		}
		
	}
}
