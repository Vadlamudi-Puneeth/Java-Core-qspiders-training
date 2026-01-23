package arrays;

public class Task18 {
	public static void main(String args[]) {
		int ele = 7;
		int arr[] = {1,2,3,4,7,8,9};
		
		for(int i = 0;i < arr.length; i++) {
			if(arr[i] == ele) {
				System.out.println(i+1);
			}
		}
		
	}
}
