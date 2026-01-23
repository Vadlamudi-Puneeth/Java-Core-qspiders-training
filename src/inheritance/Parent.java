package inheritance;

//inheritance w.r.t to static
public class Parent {
	
	static {
		System.out.println("Parent class static initializer");
	}
	
	Parent(){
		System.out.println("hufhes"); // this wont print because this can't be inherited
	}
	
	static int a = 10;
	
	static void demo() {
		System.out.println("from parent demo....");
	}
	
}
