package descisionmakingstatements;
import java.util.*;

public class Task20 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		if(((int)ch >= 97 && (int)ch <= 122) || ((int)ch >= 65 && (int)ch <= 96)){
			System.out.println("charcater");
		}else if((int)ch >= 48 && (int)ch <= 57) {
			System.out.println("numbers");
		}else {
			System.out.println("special symbols");
		}
		
	}
}
