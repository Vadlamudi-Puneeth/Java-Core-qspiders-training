package regex;

public class Example {
	public static void main(String[] args) {
		String s = "Java";
//		System.out.println(s.matches("java"));
//		System.out.println("Hello".matches("[asH]ello"));
		
		//. used to match any character
//		System.out.println("Hai".matches("H.i"));
		
//		System.out.println("h".matches("[^A-Z]"));
		
//		System.out.println("0".matches("[0-19]"));
		
//		\\d digit
//		\\D not a digit
//		\\w letter, digit or underscore
//		\\W is not a character
//		\\s space
//		\\S not space
		
//		System.out.println("*".matches("\\W"));
		
//		System.out.println("7".matches("\\d"));
//		System.out.println("h".matches("\\w"));
//		System.out.println("hai".matches("\\w+"));
//		System.out.println("_".matches("\\w"));
		
//		System.out.println(" ".matches("\\s"));
//		System.out.println("   ".matches("\\s+"));
		
//		? 0 or 1 time
//		* 0 or more
//		+1 or more than 1
//		{n} exactly n times
		
//		System.out.println("kkk".matches("k?"));
//		System.out.println("k".matches("k?"));
		
//		System.out.println("kh".matches("h+"));
		
		System.out.println("aB".matches("[a-zA-Z]"));
		System.out.println("abAd".matches("[a-zA-Z]+"));
		
//		[abc]
//		[^abc]
//		[]?
//		[]+
//		[]*
//		[]{n}
		
		System.out.println();
		
	}
}
