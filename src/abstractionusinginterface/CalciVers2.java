package abstractionusinginterface;

public class CalciVers2 extends BasicCalci implements AbstractCalciVers2{
	
	public double square(double a) {
		return Math.pow(a, 2);
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
		double square = new CalciVers2().square(2.0);
		System.out.println(square);
	}
}
