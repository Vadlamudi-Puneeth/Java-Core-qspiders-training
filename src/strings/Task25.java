package strings;

public class Task25 {
	public static void main(String[] args) {
		String s = "my name is my is";
		
		String str[] = s.split(" ");
		
		for(int i = 0;i < str.length; i++) {
			for(int j = i + 1; j < str.length; j++) {				
				if(str[i].equals(str[j])) {
					System.out.println(str[i]);
				}
			}
		}
		
	}
}
