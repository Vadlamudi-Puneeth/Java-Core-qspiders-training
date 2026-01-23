package arrays;

public class Task7 {
	public static void main(String args[]) {
		int evenCount = 0;
		int oddCount = 0;
		int arr[] = {10,11,12,13,14,15};
		
		for(int i = 0;i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		
		System.out.println(evenCount + "\n" + oddCount);
		
	}
}
