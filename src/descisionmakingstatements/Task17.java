package descisionmakingstatements;
import java.util.*;

public class Task17 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		
		if(str.equals("add")) {
			System.out.println(a+b);
		}else if(str.equals("sub")) {
			System.out.println(a-b);
		}else if(str.equals("mul")) {
			System.out.println(a*b);
		}else if(str.equals("div")) {
			if(b > 0) {				
				System.out.println(a/b);
			}else {
				System.out.println("Number should be +ve");
				b = sc.nextInt();
				
				System.out.println(a/b);
				
			}
		}
		
	}
}
