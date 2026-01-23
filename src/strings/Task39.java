package strings;

public class Task39 {
	public static void main(String[] args) {
		String str = "edwfrgthbfdfdsfdl";
		int len = 0;
		for(int i = 0;i < str.length(); i++) {
			if(Character.isLetter(str.charAt(i))) {
				len++;
			}
		}
		
		System.out.println(len == str.length());
		
	}
}
