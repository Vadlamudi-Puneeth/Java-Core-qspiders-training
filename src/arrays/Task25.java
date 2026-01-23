package arrays;

public class Task25 {
	public static void main(String args[]) {
		int marks[] = {35,76,45,32,21,56};
		int count = 0;
		
		for(int i = 0;i < marks.length; i++) {
			if(marks[i] >= 35) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
