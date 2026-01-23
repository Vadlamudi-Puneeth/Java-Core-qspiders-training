package loops;

public class Task33 {
	public static void main(String args[]) {
		int arr[] = {1,4,3,2,9,8,7,6};
		int max = arr[0];

		for(int i = 0;i < arr.length; i++) {
			if(i % 2 != 0) {
				if(max < arr[i]) {
					max = arr[i];
				}
			}
		}
		
		System.out.println(max);
	}
}
