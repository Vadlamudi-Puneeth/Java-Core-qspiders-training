package before1daypractise;

public class MoveAlltoFirst {
	public static void main(String[] args) {
		String input = "Move#Hash#to#Front";
		String res = "";
		
		for(int i = 0;i < input.length(); i++) {
			if(input.charAt(i) == '#') {
				res += input.charAt(i);
			}
		}
		
		for(int i = 0;i < input.length(); i++) {
			if(input.charAt(i) != '#') {
				res += input.charAt(i);
			}
		}
		
		System.out.println(res);
	}
}
