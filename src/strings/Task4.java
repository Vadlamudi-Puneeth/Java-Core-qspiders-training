package strings;

public class Task4 {
	public static void main(String[] args) {
		
		String str = "pune e t h  ";
		int count = 0;
		
		for(int i = 0;i < str.length(); i++) {
			if(str.charAt(i) == ' '){
				count+=1;
			}
		}
		
		System.out.println(count);
	}
}	
