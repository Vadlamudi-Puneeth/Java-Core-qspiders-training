package arrays;
import java.util.*;

public class Task12 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		int arr[] = new int[6];
		
		for(int i = 0;i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		
		System.out.println(sum/arr.length);
		
	}
}
