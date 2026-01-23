package methods;
import java.util.*;

public class Task13 {
	
	public static void isEligible(int age) {
		if(age >= 18) {
			System.out.println("you are eligible to vote");
		}else {
			System.out.println("you are not eligible to vote");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		isEligible(age);
	}
}
