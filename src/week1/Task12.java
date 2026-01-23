package week1;

public class Task12 {
	public static void main(String args[]) {
		int age = 30;
		boolean isSmoking = true;
		boolean isDrinking = false;
		int health_score = 10;
		
		String eligible = (age >= 25 && !isSmoking && !isDrinking && health_score >= 8)? "you are eligible": "you are not eligible";
		
		System.out.println(eligible);
		
	}
}
