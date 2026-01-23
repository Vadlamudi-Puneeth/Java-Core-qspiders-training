package methods;
import java.util.*;

public class Task14 {
	
	public static void multiplicationTable(int num) {
		for(int i = 1;i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		multiplicationTable(num);
		
	}
}
