package strings;
import java.util.*;

public class Task33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "puneeth";
		char c = sc.next().charAt(0);
		
		String flag = "Not found";
		for(int i = 0;i < str.length(); i++) {
			if(c == str.charAt(i)) {
				flag = "found";
			}
		}
		
		System.out.println(flag);
		
	}
}
