package arrays;

public class Task19 {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5};
		int arr1[] = new int[arr.length];
		
		for(int i = 1;i < arr.length; i++) {
			arr1[i - 1] = arr[i];
		}
		
		arr1[arr.length-1] = arr[0];
		
		for(int i = 0;i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
	}
}
