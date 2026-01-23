package strings;

public class Task35 {
	public static void main(String[] args) {
		
		String s = "my name s puneeth";
		String str[] = s.split(" ");
		
		int max = 0;
		int min = str[0].length();
		int len = 0;
		
		String small = str[0];
		String large = "";
		
		for(int i = 0;i < str.length; i++) {
			String st = str[i];
			len = st.length();
			if(min > len) {
				min = len;
				small = str[i];
			}
			if(max < len) {
				max = len;
				large = str[i];
			}
		}
		
		System.out.println(small);
		System.out.println(large);
		
	}
}
