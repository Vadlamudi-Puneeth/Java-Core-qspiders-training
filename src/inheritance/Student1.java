package inheritance;

public class Student1 extends Person1{
	
	static String name = "/Dinga";
	int price = 130;
	
	public static void main(String args[]) {
		Student1 s = new Student1();
		s.display();
	}
	
	void display() {
		System.out.println(name);
		System.out.println(super.name); // super key word only used in non static block
		System.out.println(price);
		System.out.println(super.price);
	}
	
}
