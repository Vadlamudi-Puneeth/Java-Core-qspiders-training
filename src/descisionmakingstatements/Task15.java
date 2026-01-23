package descisionmakingstatements;
import java.util.*;

public class Task15 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String role = sc.nextLine();
		String password = sc.nextLine();
		
		if(role.equals("admin") || role.equals("manager") || role.equals("user")) {
			System.out.println("role is valid\n Now enter password");
			String currentPassword = sc.nextLine();
			if(currentPassword.equals(password)) {
				System.out.println(role + " " + password);
			}else {
				System.out.println("wrong");
			}
		}
		
		
	}
}
