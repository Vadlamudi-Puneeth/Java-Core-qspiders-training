package strings;

public class Task27 {
	public static void main(String[] args) {
		String str = "my name is puneeth";
		String arr[] = str.split(" ");
		int len = 0;
		int max = 0;
		String res="";
		for(int i = 0;i < arr.length; i++) {
			String str1 = arr[i];
			len = str1.length();
			if(len > max) {
				max = len;
				res = arr[i];
			}
		}
		
		System.out.println(res);
		
	}
}
