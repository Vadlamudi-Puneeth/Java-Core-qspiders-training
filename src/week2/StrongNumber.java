package week2;

public class StrongNumber {
	
	public static int fact(int num) {
		if(num == 0 || num == 1) {
			return 1;
		}
		int prod = 1;
		for(int i = 1;i <= num; i++) {
			prod *= i;
		}
		return prod;
	}
	
	public static void main(String args[]) {
		
		int n = 185;
		int org = n;
		int sum = 0;
		
		while(n != 0) {
			int digit = n % 10;
			sum += fact(digit);
			n/=10;
		}
		
		System.out.println(sum);
		
		if(sum == org) {
			System.out.println("Strong num");
		}else {
			System.out.println("Not a strong");
		}
		
	}
}
