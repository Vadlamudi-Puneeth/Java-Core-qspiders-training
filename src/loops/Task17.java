package loops;
import java.util.*;

public class Task17 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();
		
		for(int i = low; i <= high; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
	}
}
