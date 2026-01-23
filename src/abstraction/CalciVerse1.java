package abstraction;

public class CalciVerse1 extends AbstractCalciVers1{
	public double power(double d, double e) {
		return Math.pow(d, e);
	}	
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	public static void main(String args[]) {
		double power = new CalciVerse1().power(5, 3);
		System.out.println(power);
	}

}
