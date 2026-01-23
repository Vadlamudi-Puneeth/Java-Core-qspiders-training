package strings;

public class Task6 {
	public static void main(String[] args) {
		String str = "PUNEETH";
		String str1 = "";
		for(int i = 0;i < str.length(); i++) {
			if(i % 2 != 0) {
				str1+=(char)(str.charAt(i)+32);
			}else {
				str1+=str.charAt(i);
			}
		}
		
		System.out.println(str1);
	}
}
