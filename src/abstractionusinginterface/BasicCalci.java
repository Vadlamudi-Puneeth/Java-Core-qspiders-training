package abstractionusinginterface;

public class BasicCalci implements AbstractBasicCalci{
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
		int add = new BasicCalci().add(3, 4);
		int sub = new BasicCalci().sub(3, 4);
		int mul = new BasicCalci().mul(3, 4);
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
	}
}
