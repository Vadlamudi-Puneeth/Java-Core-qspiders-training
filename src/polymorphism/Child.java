package polymorphism;

public class Child extends Parent {
	
	static int a = 101;
	int b = 101;
	
	double d = 10239;
	
	static void demo() {
		System.out.println("from child demo...");
	}
	
	public void display() {
		demo();
		super.demo();
	}
	
	void test() {
		System.out.println("from child test...");
	}
	
	public void show() {
		test();
		super.test();
	}
	
	public static void main(String args[]) {
//		System.out.println(a);
		
		Child c = new Child();
//		c.display();
//		System.out.println(c.b);
	
		c.test();
		
	}
}
