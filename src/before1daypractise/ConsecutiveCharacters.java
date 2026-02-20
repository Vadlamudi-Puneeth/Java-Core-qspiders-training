package before1daypractise;

public class ConsecutiveCharacters {
	public static void main(String[] args) {
		String input = "aabbbbeeeeffggg";
		
		char arr[] = input.toCharArray();
	
		int count = 1;
		String res = "";
		
		for(int i = 0;i < arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				count++;
			}else {
				res += arr[i] + String.valueOf(count);
				count=1;
			}
		}
		
		res += arr[arr.length-1] + String.valueOf(count);
		
		System.out.println(res);
		
	}
}
