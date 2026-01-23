package descisionmakingstatements;
import java.util.*;

public class Task11 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		if(str.length() < 6) {
			System.out.println("Weak length");
		}else if(str.length() >= 6 && str.length() <= 9) {
			System.out.println("medium");
		}else if(str.length() >= 10){
			System.out.println("String");
		}
		
	}
}
