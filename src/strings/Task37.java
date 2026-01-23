package strings;

public class Task37 {
	public static void main(String[] args) {
		String arr1[] = {"my","name","is","puneeth"};
		String arr2[] = {"i","am","from","andhra","pradesh"};
		
		String res[] = new String[arr1.length + arr2.length];
		
		int index = 0;
		for(int i = 0;i < arr1.length; i++) {
			res[index++] = arr1[i];
		}
		
		for(int i = 0;i < arr2.length; i++) {
			res[index++] = arr2[i];
		}
		
		
		for(String i: res) {
			System.out.print(i + " ");
		}
		
	}
}
