package practise;

public class Jan6 {
	
	public static boolean isPalindrome(String str) {
		str = str.toLowerCase();
		String original = str;
		
//		StringBuilder strb = new StringBuilder();
//		strb.append(str);
//		String reverse = strb.reverse().toString();
//		
		
		String reverse = "";
		
		for(int i = str.length()-1;i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		
		if(original.equals(reverse)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String args[]) {

		String s = "Madam went to the market at noon with her mom and dad. She saw a level road near the park and heard a radar sound from a nearby station. A civic volunteer asked her to refer to a notice before leaving. Later, she sat calmly and said “wow” while enjoying the peaceful evening.";
		s = s.replaceAll("[^a-zA-Z ]", "");
		
		
		String str[] = s.split("//s+");
		
		int count = 0;
		
		for(String i : str) {
			if(isPalindrome(i)) {
				count+=1;
			}
		}
		System.out.println(count);
	}
}
