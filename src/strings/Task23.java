package strings;

public class Task23 {
	public static void main(String[] args) {
		String str1 = "puneeth";
		String str2 = "puneeth";
		
		System.out.println(equalsOrNot(str1, str2));
		
	}
	
	public static boolean equalsOrNot(String str1, String str2) {
		if(str1.length() == str2.length()) {
			int i = 0;
			
			while(i < str1.length()) {
				if(str1.charAt(i) != str2.charAt(i)) {
					return false;
				}
				return true;
			}
			
		}
			return false;
		
		
	}
	
}
