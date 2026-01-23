package loops;
import java.util.*;

public class Task9 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int pin = sc.nextInt();
		
		while(pin != 123456) {
			System.out.println("Entered pin is wrong, Enter again");
			pin = sc.nextInt();
		}
		
		System.out.println("Sucessfully opened");
		
	}
}
