package strings;

public class Task29 {
	public static void main(String[] args) {
		String str = "my name is puneeth";
		String str1 = " ";
		String arr[] = str.split(" ");
		
		for(int i = 0;i < arr.length; i++) {
			str1 += arr[i].replace(arr[i].charAt(0), (char)(arr[i].charAt(0)-32));
			str1 += " ";
		}
		
		System.out.println(str1);
		
	}
}
