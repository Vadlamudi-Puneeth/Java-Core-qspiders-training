package strings;

public class Task38 {
	public static void main(String[] args) {
		String str = "1234a567890";
		int len1 = 0;

		for(int i = 0;i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				len1++;
			}
		}
		
		System.out.println(str.length() == len1);
		
	}
}
