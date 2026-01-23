package strings;

import java.util.Arrays;

public class Task30 {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "slent";
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		String res1 = new String(arr1);
		String res2 = new String(arr2);
		
		System.out.println(res1.equals(res2));
		
	}
}
