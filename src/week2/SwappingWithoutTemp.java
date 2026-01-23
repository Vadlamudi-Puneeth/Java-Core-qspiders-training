package week2;

public class SwappingWithoutTemp {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		
		a = (a + b) - a;
		b = (a + b) - b;
		
		System.out.println(a);
		System.out.println(b);
		
	}
}
