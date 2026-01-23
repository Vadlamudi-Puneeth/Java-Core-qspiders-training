package arrays;

public class Task28 {
	public static void main(String args[]) {
		int arr1[] = {23,345,5,66,7,8};
		int arr2[] = {45,3,35,67,33,5};
		
		int result[] = new int[arr1.length + arr2.length];
		int index = 0;
		
		for(int i = 0;i < arr1.length; i++) {
			result[index++] = arr1[i];
		}
		
		for(int i = 0;i < arr2.length; i++) {
			result[index++] = arr2[i];
		}
		for(int i = 0;i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		
	}
}
