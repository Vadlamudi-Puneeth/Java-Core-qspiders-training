package loops;

public class Task34 {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7};
		
		int n = arr.length;
		int max = 0;
		
		for(int i = 0;i < n/2; i++) {
			if(max > arr[i]) {
				max = arr[i];
			}
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(max);
		
	}
}
