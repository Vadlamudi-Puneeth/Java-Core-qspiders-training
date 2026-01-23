package week2;

public class XylemOrPhloem {
	public static void main(String args[]) {
		int n = 761312;
		int org = n;
		
		int last = n % 10;
		int count = 0;
		while(n != 0) {
			count++;
			n/=10;
		}
		
		int first = org / (int)Math.pow(10, count-1);
		int sumOfEnds = first + last;
//		System.out.println(sumOfEnds);
		
		int sum = 0;
		while(org != 0) {
			int digit = org % 10;
			sum+=digit;
			org/=10;
		}
		
		sum = sum - last - first;
		
		if(sum == sumOfEnds) {
			System.out.println("Xylem");
		}else {
			System.out.println("Phloem");
		}
		
	}
}
