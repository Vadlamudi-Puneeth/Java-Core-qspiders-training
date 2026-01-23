package loops;
import java.util.*;

public class Task20 {
	public static void main(String args[]) {
		
		int a = 13;
		int b = 12;
		int c = 10;
		
		int longest = (a > b && a > c) ? (a) : ((b > c && b > a) ? (b): (c)) ;
				
		System.out.println(longest);
		
	}
}
