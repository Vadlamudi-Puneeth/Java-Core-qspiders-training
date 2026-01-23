package strings;

public class Task28 {
	public static void main(String[] args) {
		String str = "my name is puneeth";
		
		String s[] = str.split(" ");
		String str1="";

		
		for(int i = 0;i < s.length; i++) {
			StringBuilder strb = new StringBuilder(s[i]);
			str1 += strb.reverse().toString();
			if(i < s.length-1) {
				str1 += " ";
			}
		}
		
		System.out.println(str1);
		
	}
}
