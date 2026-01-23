package exceptionhandling;

public class Main {
	public static void main(String args[]) {
		try {
			System.out.println(10/0);
			System.out.println("from try");
		}catch(NullPointerException n) {
			n.printStackTrace();
			System.out.println("from finally");
		}
		System.out.println("after all blocks");
	}
}
