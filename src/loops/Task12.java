package loops;
import java.util.*;

public class Task12 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int marks = 0;
		
		for(int i = 0;i < 5; i++) {
			marks = sc.nextInt();
			sum+=marks;
		}
		
		System.out.println(sum / 5);
		
	}
}
