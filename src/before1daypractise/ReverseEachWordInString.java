package before1daypractise;

public class ReverseEachWordInString {
	public static void main(String[] args) {
		
		String input = "hi nani how";
		
		String []arr = input.split(" ");
		String res = "";
		
		for(int i = 0;i < arr.length; i++) {
			StringBuilder strb = new StringBuilder(arr[i]);
			res += strb.reverse() + " ";
		}
		
		System.out.println(res.toString().trim());
		
	}
}
