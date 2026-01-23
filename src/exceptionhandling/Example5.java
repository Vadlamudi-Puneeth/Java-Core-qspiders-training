package exceptionhandling;

public class Example5 {
	public static void main(String[] args) {
		try {
			System.out.println("hai");
			try {
				System.out.println(10 / 0);
			}catch(NullPointerException n) {
				System.out.println("handled");
			}finally {
				System.out.println("Inner finally");
			}
		}finally {
			System.out.println("from finally!!!");
		}
		
		System.out.println("bye");
	}
}
