package strings;

public class Task21 {
	public static void main(String[] args) {
		String s = "my name puneeth";
		String[] str = s.split(" ");
		String s1 = "";

		for (int i = 0; i < str.length; i++) {
			StringBuilder strb = new StringBuilder(str[i]);
			s1 += strb.reverse().toString();
			if (i < str.length - 1) {
				s1 += " ";
			}
		}

		System.out.println(s1);
	}
}
