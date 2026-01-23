package week2;

public class NeonNumber {
	public static void main(String argsp[]) {
		int n = 9;
		int sqr = (int)Math.pow(n, 2);
		int sum = 0;
		
		while(sqr!=0) {
			int digit = sqr% 10;
			sum+=digit;
			sqr/=10;
		}
		
		if(sum == n) {
			System.out.println("Neon number");
		}else {
			System.out.println("Not a neon number");
		}
		
	}
}
