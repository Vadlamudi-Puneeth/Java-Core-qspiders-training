package arrays;
import java.util.*;

public class Task13 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
	
		for(int i = 0;i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int element = sc.nextInt();
		boolean flag = false;
		
		for(int i = 0;i < arr.length; i++) {
			if(arr[i] == element) {
				flag = true;
			}
		}
		
		if(flag) {
			System.out.println("present");
		}else {
			System.out.println("absent");
		}
		
	}
}
