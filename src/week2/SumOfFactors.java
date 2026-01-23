package week2;

public class SumOfFactors {
	public static void main(String args[]) {
		int n = 40;
		int sum = 0;
		
		for(int i = 1; i <= 40; i++) {
			if(n % i == 0) {
				sum+=i;
			}
		}
		
		System.out.println(sum);
	}
}
