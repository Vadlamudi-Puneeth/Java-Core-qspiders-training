package arrays;

public class Task29 {
	public static void main(String args[]) {
		int arr[] = {10,22,4,4,2,21,9};
		
		int max1 = arr[0];
		int index1 = 0;
		
		for(int i = 0;i < arr.length; i++) {
			if(arr[i] > max1) {
				max1 = arr[i];
				index1 = i;
			}
		}
		
		System.out.println(max1);
		int max2 = 0;
		arr[index1] = 0;
		
		for(int i = 0;i < arr.length; i++) {
			if(arr[i] > max2) {
				max2 = arr[i];
			}
		}
		
		System.out.println(max2);
		
	}
}
