package descisionmakingstatements;
import java.util.*;

public class Task10 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int attendance = sc.nextInt();
		
		if(attendance < 60) {
			System.out.println("heavy fine");
		}else {
			System.out.println("less fine");
		}
		
	}
}
