package strings;

public class Task12 {
	public static void main(String[] args) {
		
		String str = "puneeth";
		str = str.toLowerCase();

		String str1 = "";
		
		for(int i = 0;i < str.length(); i++) {
			if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u') {
				str1 += str.charAt(i);
			}
		}
		System.out.println(str1);
	}
}
