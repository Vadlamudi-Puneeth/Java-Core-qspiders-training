package functionalprogramming;
import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		
		List<Integer> ls = Arrays.asList(10, 50, 30, 20, 0);
		ls.forEach(n -> System.out.print(n + " "));
//		
//		Collections.sort(ls, (a,b) -> a-b);
//		System.out.println();
//		ls.forEach(n -> System.out.print(n + " "));
//		
//		Collections.sort(ls, (a,b) -> b-a);
		System.out.println();
//		ls.forEach(n -> System.out.print(n + " "));
		
		ls.sort((a,b) -> b-a);
		ls.forEach(n -> System.out.print(n + " "));
	}
}
