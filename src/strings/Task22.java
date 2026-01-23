package strings;

public class Task22 {
	public static void main(String[] args) {
		String str = "madam";
		String original = str;
		String reverse = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		
		System.out.println(original.equals(reverse));
		
	}
}
