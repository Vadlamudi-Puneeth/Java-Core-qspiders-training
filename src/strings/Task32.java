package strings;

public class Task32 {
	public static void main(String[] args) {
		String str = "puneeth";
		String str1 = "";
		
		for(int i = 0;i < str.length(); i++) {
			if(i % 2 != 0)
				str1 += str.charAt(i);
		}
		
		System.out.println(str1);
		
	}
}
