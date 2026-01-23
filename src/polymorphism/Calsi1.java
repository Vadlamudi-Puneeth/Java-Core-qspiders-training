package polymorphism;

public class Calsi1 extends Calci{
	void add() {
		int a = 20;
		int b = 20;
		System.out.println(a+b);
	}
	
	public static void main(String args[]) {
		Calci c = new Calsi1();
		c.add();
	}
}
