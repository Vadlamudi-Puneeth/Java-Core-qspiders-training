package operator;

public class Task8 {
	public static void main(String args[]) {
		String user_name = "nani";
		String password = "123";
		boolean isAccountLocked = false;
		int total_attempts = 5;
		int no_of_attempts = 0;
		
		
		String isLogin = (user_name.equals("nani") && password.equals("123") && !isAccountLocked) ? "Login success" : "Login Failed";
		
		
		no_of_attempts = isLogin.equals("Login Failed")? (no_of_attempts+=1): no_of_attempts;
				
		isAccountLocked = no_of_attempts >= total_attempts;
		
		System.out.println(isLogin);
		System.out.println(isAccountLocked? "is Locked": "is Not Locked");
		
	}
}
