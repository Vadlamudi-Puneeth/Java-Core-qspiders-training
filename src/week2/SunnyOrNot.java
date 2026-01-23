package week2;

public class SunnyOrNot {
	public static void main(String args[]) {
		int n = 3;
		
		int inc = n+1;
		if((int)Math.sqrt(inc) * (int)Math.sqrt(inc) == inc) {
			System.out.println("Sunny number");
		}else {
			System.out.println("Not a sunny number");
		}
		
	}
}
