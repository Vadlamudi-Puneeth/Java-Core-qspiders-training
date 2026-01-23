package methods;
import java.util.*;

public class Task6 {
	
	public static void calculatingSalary(int basic) {
		System.out.println(basic);
	}
	
	public static void calculatingSalary(int basic, int bonus) {
		System.out.println(basic + bonus);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		calculatingSalary(40000);
		calculatingSalary(40000,50000);
	}
}
