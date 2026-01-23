package nonstatic;

public class Engine {
	public static void main(String args[]) {
		Car c = new Car();
		c.a += 10;
		System.out.println(c.a);
		
		Car c1 = new Car();
		System.out.println(c1.a);
		
		Car c12 = new Car();
		System.out.println(c12.a);
	}
}
