package methods;
import java.util.*;

public class Task1 {
	
	public static boolean isUserLoggedIn(boolean userLogin) {
		return true;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean userLogin = sc.nextBoolean();
		if(isUserLoggedIn(userLogin) == true) {			
			System.out.println("welcome");
		}
	}
}
