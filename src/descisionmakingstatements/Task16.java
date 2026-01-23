package descisionmakingstatements;
import java.util.*;

public class Task16 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int speed = sc.nextInt();
		
		if(speed > 120) {
			System.out.println("License Cancelled");
		}else if(speed >= 90 && speed <= 120) {
			System.out.println("Heavy fine");
		}else if(speed > 60 && speed <= 89) {
			System.out.println("Normal fine");
		}else if(speed <= 60) {
			System.out.println("No fine");
		}
		
	}
}
