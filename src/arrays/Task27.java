package arrays;

public class Task27 {
	public static void main(String args[]) {
		int marks[] = {78,89,67,87,97};
		int sum = 0;
		for(int i = 0;i < marks.length; i++) {
			sum+=marks[i];
		}
		
		System.out.println(sum);
		
		for(int i = 0;i < marks.length; i++) {
			if(marks[i] >= 90) {
				System.out.println("O");
			}else if(marks[i] >= 80) {
				System.out.println("A+");
			}else if(marks[i] >= 70) {
				System.out.println("A");
			}else if(marks[i] >= 60) {
				System.out.println("B+");
			}else {
				System.out.println("fail");
			}
		}
		
	}
}
