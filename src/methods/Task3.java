package methods;
import java.util.*;

public class Task3 {
	
	public static int totalMarks(int a,int b,int c,int d,int e) {
		return (a+b+c+d+e);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println(totalMarks(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
	}
}
