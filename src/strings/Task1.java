package strings;

public class Task1 {
	public static void main(String[] args) {
		
		String l = "PUNEETH";
		
		char arr[] = new char[l.length()];
		
		for(int i = 0;i < l.length(); i++) {
			if(l.charAt(i) >= 65 && l.charAt(i) <= 90) {
				arr[i] = (char) (l.charAt(i) + 32);
			}else {
				arr[i] = (char) l.charAt(i);
			}
		}
		
		String s = new String(arr);
		System.out.println(s);
		
	}
}
