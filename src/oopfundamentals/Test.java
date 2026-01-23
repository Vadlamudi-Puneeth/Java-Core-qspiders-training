package oopfundamentals;

public class Test {
	static int a;
	public static void main(String args[]) {
		
		System.out.println(a);
		System.out.println(Test.a);
		
		Test t = new Test();
		System.out.println(t.a);
		
	}
}
