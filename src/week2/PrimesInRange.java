package week2;

public class PrimesInRange {
	public static void main(String args[]) {
		int low = 5;
		int high = 25;
		
		for(int i = low; i <= high; i++) {
			boolean flag = true;
			for(int j = 2;j < i; j++) {
				if(i % j == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.print(i + " ");
			}
		}
		
	}
}
