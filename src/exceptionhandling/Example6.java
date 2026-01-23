package exceptionhandling;
import java.util.*;

public class Example6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			while(b == 0) {
				System.out.println("Enter the number except 0 ");
				b = sc.nextInt();
			}
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic");
		}
		finally {
			System.out.println("from finally");
		}
		
	}
}
