package loops;
import java.util.*;

public class Question1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char ch = ' ';
		
		do {
			System.out.println("welcome");
			ch = sc.next().charAt(0);
		}while(ch == 'y');
		
	}
}
