package week1;

public class Task8 {
	public static void main(String args[]) {
		boolean user_name = true;
		boolean password = true;
		boolean otp = true;
		
		String isLoggedIn = (user_name && password && otp)?"Login Success" : "Login failed";
		
		System.out.println(isLoggedIn);
		
	}
}
