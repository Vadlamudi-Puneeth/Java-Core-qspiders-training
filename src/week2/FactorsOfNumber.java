package week2;

public class FactorsOfNumber {
	public static void main(String args[]) {
		int n = 40;
		
		for(int i = 1; i <= 40; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		
	}
}
