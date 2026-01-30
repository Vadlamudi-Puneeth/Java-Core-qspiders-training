package jan29;
import java.util.*;

public class LexicalTwist {
	public static void main(String[] args) {
		String firstWord = "Apple";
		String secondWord = "Orange";
		
		String reverse = new StringBuilder(secondWord).reverse().toString();
		
		if(reverse.equals(firstWord)) {
			
			String reverseFirstWord = new StringBuilder(firstWord).reverse().toString();
			reverseFirstWord = reverseFirstWord.toLowerCase();
			
			
			for(int i = 0;i < reverseFirstWord.length(); i++) {
				char ch = reverseFirstWord.charAt(i);
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					reverseFirstWord = reverseFirstWord.replace(ch, '@');
				}
			}
			
			System.out.println(reverseFirstWord);
			
		}else {
			
			String combined = (firstWord + secondWord).toUpperCase();
			
			int vowels = 0;
			int consonants = 0;
			
			for(int i = 0;i < combined.length(); i++) {
				char ch = combined.charAt(i);
				if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
					vowels++;
				}else {
					consonants++;
				}
			}
			
			Set<Character> vowelsList = new LinkedHashSet<>();
			Set<Character> consonantsList = new LinkedHashSet<>();
			
			for(char ch: combined.toCharArray()) {
				if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
					vowelsList.add(ch);
				}else {
					consonantsList.add(ch);
				}
			}
			
			StringBuilder strb1 = new StringBuilder();
			StringBuilder strb2 = new StringBuilder();
			
			for(char c: vowelsList) {
				if(strb1.length() == 2) {
					break;
				}else {
					strb1.append(c);
				}
			}
			
			for(char c: consonantsList) {
				if(strb2.length() == 2) {
					break;
				}else {
					strb2.append(c);
				}
			}
			
			if(vowels > consonants) {
				System.out.println(strb1);
			}else if(consonants > vowels) {
				System.out.println(strb2);
			}else {
				System.out.println("Vowels and Consonants are equal");
			}
			
		}
		
		
	}
}
