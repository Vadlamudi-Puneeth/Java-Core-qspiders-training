package week2;

public class PrimeOrComposite {
	public static void main(String args[]) {
		int n = 9;
		int count = 0;
		
		for(int i = 2;i < n; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("prime");
		}else {
			System.out.println("composite");
		}
	}
}
