package loops;

public class Task28 {
	public static void main(String args[]) {
		int n = 3592;
		int original = n;
		int reverse = 0;
		
		
		
		while(original != 0) {
			int digit = original % 10;
			reverse = reverse * 10 + digit;
			original/=10;
		}
		
		System.out.println(reverse);
		
	}
}
