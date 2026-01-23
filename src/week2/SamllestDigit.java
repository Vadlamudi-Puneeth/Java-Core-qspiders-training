package week2;

public class SamllestDigit {
	public static void main(String args[]) {
		int n = 8459;
		int min = n % 10;
		
		while(n != 0) {
			int digit = n % 10;
			if(digit < min) {
				min = digit;
			}
			n/=10;
		}
		
		System.out.println(min);
		
	}
}
