package week1;

public class Task9 {
	public static void main(String args[]) {
		int marks = 80;
		int family_income = 300000;
		boolean sports_quota = false;
		boolean ncc_cert = true;
		
		String eligible = (marks >= 85 && family_income <= 300000 && (sports_quota || ncc_cert)) ? "is eligible":"is not eligible";
		
		System.out.println(eligible)		;
	}
}
