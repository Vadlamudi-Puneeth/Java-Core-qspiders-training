package abstraction;

public class BasicCalci extends AbstractBasicCalci{
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
		int add = new BasicCalci().add(2,3);
		int sub = new BasicCalci().sub(2,3);
		int mul = new BasicCalci().mul(2,3);
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
	}
}
