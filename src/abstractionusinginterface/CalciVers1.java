package abstractionusinginterface;


public class CalciVers1 extends BasicCalci implements AbstractCalciVers1{
	public double power(double a, double b) {
		return Math.pow(a, b);
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	public static void main(String args[]) {
		double power = new CalciVers1().power(2, 3);
		System.out.println(power);
	}
}
