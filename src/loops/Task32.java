package loops;

public class Task32 {
	public static void main(String args[]) {
		int arr[] = {1,4,3,2,9,8,7,6};
		int min = arr[1];

		for(int i = 0;i < arr.length; i++) {
			if(i % 2 != 0) {
				if(min > arr[i]) {
					min = arr[i];
				}
			}
		}
		
		System.out.println(min);
		
	}
}
