package arrays;

public class Task21 {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7};
		
		int arr1[] = new int[arr.length];
		
		int index= 0;
		for(int i = 0;i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				arr1[index++] = arr[i];
			}
		}
		
		for(int i = 0;i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				arr1[index++] = arr[i];
			}
		}
		
		for(int i = 0;i < arr.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
	}
}
