package strings;

public class Task3 {
	public static void main(String[] args) {
		String str = "1234abcdef@#$%(";
		str=str.toLowerCase();
		
		int numLen = 0;
		int vowels = 0;
		int consonants = 0;
		int specialLen = 0;
		
		for(int i = 0;i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||  str.charAt(i) == 'u') {
				vowels+=1;
			}else if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				numLen+=1;
			}else if((str.charAt(i) != 'a' || str.charAt(i) != 'e' || str.charAt(i) != 'i' || str.charAt(i) == 'o' ||  str.charAt(i) == 'u') && (str.charAt(i) >=97 && str.charAt(i) <= 122)) {
				consonants+=1;
			}else {
				specialLen+=1;
			}
		}
		
		System.out.println(numLen);
		System.out.println(vowels);
		System.out.println(consonants);
		System.out.println(specialLen);
		
	}
}
