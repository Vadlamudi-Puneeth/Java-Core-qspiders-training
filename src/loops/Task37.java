package loops;

public class Task37 {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7};
		
		int n = arr.length;
		int sum = 0;
		for(int i = n/2;i < n; i++) {
			sum+=arr[i];
		}
		System.out.print(sum / (n/2));
	}
}
