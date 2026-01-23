package loops;

public class Task24 {
	public static void main(String args[]) {
		int count = 0;
		int n = 23456;
		
		while(n != 0) {
			n/=10;
			count++;
		}
		
		System.out.println(count);
		
	}
}
