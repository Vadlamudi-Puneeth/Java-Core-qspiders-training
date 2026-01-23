package abstraction;

public class child extends Parent{
	public static void main(String args[]) {
//	Parent p = new Parent()  abstract class cannot be inherited
		new child().demo();
	}
}
