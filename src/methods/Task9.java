package methods;
import java.util.*;

public class Task9 {
	
	public static int TotalMarks(int sub1, int sub2,int sub3) {
		return (sub1 + sub2 + sub3);
	}
	
	public static void calculateGrade(int total) {
		int avg = total/3;
		if(avg >= 90) {
			System.out.println("O");
		}else if(avg >= 80) {
			System.out.println("A+");
		}else if(avg >= 70) {
			System.out.println("A");
		}else {
			System.out.println("B");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();
		int total = TotalMarks(sub1, sub2, sub3);
		calculateGrade(total);
	}
}
