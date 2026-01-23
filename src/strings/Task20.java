package strings;

public class Task20 {
	public static void main(String[] args) {
		String str = "puneetp";
		StringBuilder strb = new StringBuilder();
		
		String str1 = strb.append(str).reverse().toString();
		System.out.println(str1);
	}
}
