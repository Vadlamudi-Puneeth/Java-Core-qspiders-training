package week2;

public class TechNumber {
	public static void main(String args[]) {
		
		int n = 2026;
		int org = n;
		int count = 0;
		
		while(n != 0) {
			count++;
			n/=10;
		}
		
		count = count / 2;
		
		int firstHalf = org / (int)Math.pow(10, count);
		int secondHalf = org % (int)Math.pow(10, count);
		
		System.out.println(firstHalf);
		System.out.println(secondHalf);
		
		int sum = firstHalf + secondHalf;
		
		if((int)Math.pow(sum, 2) == org) {
			System.out.println("Tech Number");
		}else {
			System.out.println("not a tech number");
		}
		
	}
}
