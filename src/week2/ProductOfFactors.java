package week2;

public class ProductOfFactors {
	public static void main(String args[]) {
		int n = 40;
		int prod = 1;
		
		for(int i = 1; i <= 40; i++) {
			if(n % i == 0) {
				prod *= i;
			}
		}
		
		System.out.println(prod);
	}
}
