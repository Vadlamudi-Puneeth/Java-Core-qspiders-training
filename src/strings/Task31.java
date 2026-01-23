package strings;

import java.util.Arrays;

public class Task31 {
	public static void main(String[] args) {
		String str1 = "The quick brown fox jumps over the lazy dog";
		String str2 = "qwertyuiopasdfghjklzxcvbnm";
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		System.out.println(panagram(arr1, arr2));
		
	}
	
	public static boolean panagram(char[] arr1, char[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
		boolean flag = false;
		for(int i = 0;i < arr2.length; i++) {
			flag = false;
			for(int j = 0; j < arr1.length; j++) {				
				if(arr2[i] == arr1[j]) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				return flag;
			}
		}
		return flag;
		
	}
}
