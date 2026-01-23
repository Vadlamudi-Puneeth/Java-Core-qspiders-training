package strings;

public class Task2 {
	public static void main(String[] args) {
		String s = "puneeth";
		char arr[] = new char[s.length()];
		
		for(int i = 0;i < s.length(); i++) {
			if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				arr[i] = (char)(s.charAt(i) - 32);
			}
		}
		
		String l = new String(arr);
		System.out.println(l);
		
	}
}
