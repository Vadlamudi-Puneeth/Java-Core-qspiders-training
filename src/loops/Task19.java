package loops;
import java.util.*;

public class Task19 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int count = 0;
		
		for(int i = 2;i <= 80; i++) {
			if(i % 2 != 0) {
				if(count >= 10) {
					break;
				}
				count++;
				sum += i;
			}
		}
		
		System.out.println(sum);
		
	}
}
