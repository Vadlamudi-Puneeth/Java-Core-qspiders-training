package arrays;

public class Task11 {
	public static void main(String args[]) {
		int arr[] = {-4,33,-96,23,1};
		
		for(int i = 0;i < arr.length; i++) {
			if(arr[i] < 0) {
				arr[i] = 0;
			}
		}
		
		
		for(int i = 0;i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
