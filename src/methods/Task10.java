package methods;
import java.util.*;

public class Task10 {
	
	public static void EvenOrOdd(int num) {
		if(num % 2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		EvenOrOdd(num);
	}
}
