package week1;

public class Task3 {
	public static void main(String args[]) {
		int age = 30;
		double monthly_salary = 40000;
		int credit_score = 720;
		
		String isEligible = ((age >= 21 && age <= 60) && monthly_salary >= 25000 && credit_score >= 700)? "Eligible": "Not Eligible";
		
		System.out.println(isEligible);
		
	}
}
