package loops;
import java.util.*;

public class Task7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 3; i <= 5; i++) {
			
			for(int j = 1;j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
		
	}
}
