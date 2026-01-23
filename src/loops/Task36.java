package loops;

public class Task36 {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7};
		
		int n = arr.length;
		int sum = 0;
		for(int i = 0;i < n/2; i++) {
			sum+=arr[i];
		}
		System.out.print(sum / (n/2));
	}
}
