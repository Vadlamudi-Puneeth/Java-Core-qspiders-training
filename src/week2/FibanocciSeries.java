package week2;

public class FibanocciSeries {
	public static void main(String args[]) {
		
		int high = 25;
		
		int arr[] = new int[high];
		
		arr[0] = 0;
		arr[1] = 1;
		
		
		for(int i = 2;i < high; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
	
		for(int i = 0;i < arr.length; i++) {
			if(arr[i] <= high) {				
				System.out.print(arr[i] + " ");
			}
		}
		
	}
}
