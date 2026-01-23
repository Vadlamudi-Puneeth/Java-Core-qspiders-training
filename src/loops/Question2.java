package loops;
import java.util.*;

public class Question2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		for(char ch = 'a'; ch <= 's'; ch++) {
			if((int)ch % 2 == 0){
				System.out.println(ch + " -> " + (int)ch);
			}
		}
	
	}
}
