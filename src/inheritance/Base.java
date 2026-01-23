package inheritance;

public class Base {
	static {
		System.out.println("parent is loaded");
	}
	
	static void demo() {
		System.out.println("from parent demo....");
	}
	
	public static void main(String args[]) {
		//when we call parent member
//		Base.demo();
		
		//child member
		Derived.test(); //after dot what ever method is there respect to that method class all static print first then what ever method we calls that will next
//		Derived.demo();
		
	}
	
}
