package week2;

public class ArmStrongNumber {
	public static void main(String args[]) {
		int n = 53;
		int org = n;
		int sum = 0;
		
		while(n != 0) {
			int digit = n % 10;
			sum+=(int)Math.pow(digit, 3);
			n/=10;
		}
		
		if(sum == org) {
			System.out.println("armstrong number");
		}else {
			System.out.println("Not an armstrong number");
		}
		
	}
}
