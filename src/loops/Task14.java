package loops;
import java.util.*;

public class Task14 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String userSelects = sc.nextLine();
		do {
			System.out.println("running");
			userSelects = sc.nextLine();
		}while(!userSelects.equals("logout"));
	}
}
