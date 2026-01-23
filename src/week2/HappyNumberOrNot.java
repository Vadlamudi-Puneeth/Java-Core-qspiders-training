package week2;
import java.util.*;

public class HappyNumberOrNot {
	
	public static int squareSum(int n) {
		int sum = 0;
		while(n != 0) {
			int digit = n % 10;
			sum+=(int)Math.pow(digit, 2);
			n/=10;
		}
		return sum;
	}
	
	public static boolean isHappyNumber(int n) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(true) {
			n = squareSum(n);
			if(n == 1) {
				return true;
			}
			if(set.contains(n)) {
				return false;
			}
			set.add(n);
		}
	}
	
	public static void main(String args[]) {
		
		int n = 21;
		
		System.out.println(isHappyNumber(n));
		
	}
}
