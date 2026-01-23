package loops;

public class Task25 {
	public static void main(String args[]) {
		int n = 34566;
		int org = n;
		int count = 0;
		while(n != 0) {
			n/=10;
			count++;
		}
		
		int firstDigit = org / (int)Math.pow(10, count - 1);
		
		if(firstDigit % 2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
	}
}
