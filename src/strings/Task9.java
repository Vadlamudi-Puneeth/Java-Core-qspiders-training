package strings;

public class Task9 {
	public static void main(String[] args) {
		String str = "p u n eet h";
		String str1 = "";
		
		for(int i = 0;i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				str1 += str.charAt(i);
			}
		}
		
		System.out.println(str1);
	}
}
