package arrays;

public class Task15 {
	public static void main(String args[]) {
		int key  = 3;
		int arr[] = {1,2,3,3,3,5,6,7,8,3,3};
		
		int count = 0;
		
		for(int i = 0;i < arr.length; i++) {
			if(arr[i] == key) {
				count++;
			}
		}
		
		System.out.println(count++);
		
	}
}
