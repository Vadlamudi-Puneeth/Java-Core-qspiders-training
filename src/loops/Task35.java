package loops;

public class Task35 {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7};
		
		int n = arr.length;
		
		for(int i = n/2;i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
