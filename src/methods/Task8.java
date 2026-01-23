package methods;
import java.util.*;

public class Task8 {
	
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public static void add(double a,double b) {
		System.out.println(a+b);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		add(2,3);
		add(2,3,4);
		add(3.4,2.4);
		
	}
}
