package week2;

public class SpyNumber {
	public static void main(String args[]) {
		int n = 1124;
		
		int sum = 0;
		int prod = 1;
		
		while(n != 0) {
			int digit = n % 10;
			sum+=digit;
			prod*=digit;
			n/=10;
		}
		
		if(sum == prod) {
			System.out.println("spy number");
		}else {
			System.out.println("Not a spy");
		}
		
	}
}
