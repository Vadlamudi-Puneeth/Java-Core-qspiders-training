package methods;
import java.util.*;

public class Task15 {
	
	public static void squareRoot(int num) {
		System.out.println(num * num);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		squareRoot(num);
	}
}
