package week2;

public class PrimeDigit {
	
	public static boolean isPrime(int n) {
		if(n == 2 || n == 3) {
			return false;
		}
		
		boolean flag = false;
		for(int i = 2;i < n; i++) {
			if(n % i == 0) {
				flag = true;
				break;
			}
		}
		
		return flag;
		
	}
	
	public static void main(String args[]) {
		int n = 24679;
		
		while(n != 0) {
			int digit = n % 10;
			if(!isPrime(digit)) {
				System.out.println(digit);
			}
			n/=10;
		}
		
	}
}
