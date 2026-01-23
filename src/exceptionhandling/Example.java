package exceptionhandling;

public class Example {
	public static void main(String args[]) {
		
		System.out.println("haii");
//		System.out.println("hloo");
//		System.out.println(10/0);
//		System.out.println("bye");

		try {
			System.out.println(10/0); // only AE exception if we put other than that error here
		}catch(Throwable e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			System.out.print("handled");
		}
		
	}
}
