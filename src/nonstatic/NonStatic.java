package nonstatic;

public class NonStatic {
	public int add(int a,int b) {
		return a+b;
	}
	public static void main(String args[]) {
		NonStatic obj = new NonStatic();
		System.out.println(obj.add(10,20));
	}
}
