package exceptionhandling;
import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println(10/0);
		}catch(NullPointerException ne) {
			System.out.println("handled in catch1");
		}catch(ArithmeticException ae) {
			System.out.println("handled in catch2");
		}catch(Exception e) {
			System.out.println("exception in catch3");
		}
		finally {
			System.out.println("handled");
		}
	
	}
}
