package week2;

public class LargestDigit {
	public static void main(String args[]) {
		int n = 3459;
		int max = n % 10;
		
		while(n != 0) {
			int digit = n % 10;
			if(digit > max) {
				max = digit;
			}
			n/=10;
		}
		
		System.out.println(max);
		
	}
}
