package methods;
import java.util.*;

public class Task12 {
	
	public static int maximumOfTwo(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		}
		return num2;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(maximumOfTwo(num1, num2));
	}
}
