package loops;

public class Task27 {
	public static void main(String args[]) {
		int n = 2345;
		int prod = 1;
		
		while(n != 0) {
			int digit = n % 10;
			prod*=digit;
			n/=10;
		}
		
		System.out.println(prod);
	}
}
