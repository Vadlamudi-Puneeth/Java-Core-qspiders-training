package loops;
import java.util.*;

public class Task11 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String userSelects = sc.nextLine();
		do {
			System.out.println("menu");
			userSelects = sc.nextLine();
		}while(!userSelects.equals("exits"));
		
	}
}
