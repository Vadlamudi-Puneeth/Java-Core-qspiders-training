package week2;

public class GCDofTwoNum {
	public static void main(String args[]) {
		int num1 = 12;
		int num2 = 18;
		
		int fact = 0;
		if(num1 < num2) {
			for(int i = 1;i <= num1; i++) {
				if(num1 % i == 0 && num2 % i == 0) {
					fact = i;
				}
			}
		}else {
			for(int i = 1;i <= num2; i++) {
				if(num1 % i == 0 && num2 % i == 0) {
					fact = i;
				}
			}
		}
		
		System.out.println(fact);
		
	}
}
