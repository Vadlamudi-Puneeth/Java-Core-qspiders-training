package week2;

public class DuckNumber {
	public static void main(String args[]) {
		int n = 0233;
		int org = n;
		
		int count = 0;
		
		
		while(n != 0) {
			n/=10;
			count++;
		}
		
		int FirstOne = org / (int)Math.pow(10, count-1);
		System.out.println(FirstOne);
		int zeroCount = 0;
		int count1 = 0;
		
		
			while(org != 0) {
				int digit = org % 10;
				if(count1 >= 1 && digit == 0) {
					zeroCount++;
				}
				count1++;
				org/=10;
			}
			
			System.out.println(zeroCount);
		
			if(FirstOne != 0 && zeroCount >= 1) {
				System.out.println("Duck Number");
			}else {
				System.out.println("Not a Duck Number");
			}
		
	}
}
