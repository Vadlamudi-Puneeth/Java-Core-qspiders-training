package inheritance;

public class Derived extends Base{

	static {
		System.out.println("child is loaded");
	}
	
	static void test() {
		System.out.println("from child demo....");
	}
	
	

	
}
