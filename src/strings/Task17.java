package strings;

public class Task17 {
	public static void main(String[] args) {
		String s = "puneeth is sleeping";
		String str[] = s.split(" ");
		String res[] = new String[str.length];

		String str1  = "";
	
		int index = 0;
		for(String st: str) {
			str1 = st.replace(st.charAt(0), (char)(st.charAt(0)-32));
			res[index++] = str1;
		}
		
		for(String i: res) {
			System.out.println(i);
		}
		
		
		
	}
}
