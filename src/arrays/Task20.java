package arrays;

public class Task20 {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5};
		int arr1[] = new int[arr.length];
		
		for(int i = 0;i < arr.length-1; i++) {
			arr1[i + 1] = arr[i];
		}
		
		arr1[0] = arr[arr.length-1];
		
		for(int i = 0;i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
	}
}
