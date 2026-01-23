package arrays;

public class Task14 {
	public static void main(String args[]) {
		
		int arr[] = {0,11,0,0,4,5,6,7,0};
		int arr1[] = new int[arr.length];
		
		int index = 0;
		for(int i = 0;i < arr.length; i++) {
			if(arr[i] != 0) {
				arr1[index++] = arr[i];
			}
		}
		
		for(int i = 0;i < arr.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
	}
}
