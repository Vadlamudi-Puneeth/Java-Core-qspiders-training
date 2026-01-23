package methods;
import java.util.*;

public class Task2 {
	
	public static void markingAttendance(String name) {
		System.out.println(name);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		markingAttendance(name);
	}
}
