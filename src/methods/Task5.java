package methods;
import java.util.*;

public class Task5 {
	public static void calculatingBill(int product1) {
		System.out.println(product1);
	}
	
	public static void calculatingBill(int product1, int product2) {
		System.out.println(product1+product2);
	}
	public static void main(String args[]) {
		calculatingBill(20,30);
		calculatingBill(10);
	}
}
