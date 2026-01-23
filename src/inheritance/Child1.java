package inheritance;

public class Child1 extends Parent1{
	public static void main(String args[]) {
		// we can create either parent or child no matter because it is inherited
		Child1 c = new Child1();
		System.out.println(c.a);
		c.demo();
	}
}
