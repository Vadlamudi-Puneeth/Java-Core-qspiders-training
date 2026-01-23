package arrays;

public class Task10 {
	public static void main(String args[]) {
		int evenElements = 0;
		int oddElements = 0;
		
		int arr[] = {10,11,12,13,18};
		
		for(int i = 0;i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenElements+=arr[i];
			}else {
				oddElements+=arr[i];
			}
		}
		
		System.out.println(evenElements+oddElements);
		
	}
}
