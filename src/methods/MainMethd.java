package methods;

public class MainMethd {
	
	public static void main(String args[]) {
		System.out.println("from main....!");
		main(10,20);
		main('k');
	}
	
	public static void main(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void main(char a) {
		System.out.println(a);
	}
	
}
