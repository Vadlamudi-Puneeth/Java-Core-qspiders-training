package polymorphism;

public class Examplee {
	int a = 10;
	public static void main(String args[]) {
		int a = 20;
		System.out.println(a);
		Examplee e = new Examplee();
		System.out.println(e.a);
	}
}
