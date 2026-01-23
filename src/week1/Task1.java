package week1;

public class Task1 {
	public static void main(String args[]) {
		int telugu = 50;
		int hindi = 60;
		int english = 70;
		
		int total_marks = telugu + hindi + english;
		
		System.out.println(total_marks);
		
		String result = (telugu >= 40 && hindi >= 40 && english >= 40 && total_marks >= 40) ? "passed": "failed";
		
		System.out.println(result);
		
	}
}
