package practiseq3;

public class Decoded {
	public static void main(String[] args) {
		
		String str = "EJGWF";
		if(str.length() <= 4) {
			System.out.println("The string <String> has minimum length");
		}
		
		for(int i = 0;i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				System.out.println("contains space");
			}
		}
		
		String res = "";
		int n = str.length();
		
		for(int i = 0;i < str.length(); i++) {
			res += (char)((int)str.charAt(i) - str.length());
		}
		
		System.out.println(res);
	}
}
