package abstraction;

public class CalciVers2 extends AbstractCalciVers2{
	public double square(double d) {
		return Math.pow(d, 2);
	}
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public static void main(String args[]) {
		double square = new CalciVers2().square(5);
		System.out.println(square);
	}
}
