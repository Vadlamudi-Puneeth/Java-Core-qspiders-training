package strings;

public class Task18 {
	public static void main(String[] args) {
		String s = "puneeth is sleeping";
		
		String arr[] = new String[s.length()];
		String temp = "";
		int index = 0;
		for(int i = 0;i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				arr[index++] = temp;
				temp = "";
			}else {
				temp += s.charAt(i);
			}
		}
		
		arr[index++] = temp;
		
		for(int i = 0;i < index; i++) {
			System.out.println(arr[i]);
		}
		
		String st1 = "";
		String res[] = new String[arr.length+1];
		int index1 = 0;
		
		for(int i = 0;i < index; i++) {
			String st = arr[i];
			st1 = st.replace(st.charAt(0), (char)(st.charAt(0)-32));
			System.out.println(st1);
			res[index1++] = st1;
		}
		
		
	}
}
