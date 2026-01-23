package week1;

public class Task5 {
	public static void main(String args[]) {
		double total_working_days = 30;
		double no_of_attend = 24;
		double attendance = (no_of_attend/total_working_days) * 100;
		System.out.println(attendance);
		
		String isEligible = (no_of_attend >= 25) ? "Eligible for Exam" : "Not Eligible";
		System.out.println(isEligible);
	}
}
