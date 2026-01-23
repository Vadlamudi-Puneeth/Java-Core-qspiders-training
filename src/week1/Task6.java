package week1;

public class Task6 {
	public static void main(String args[]) {
		int weight = 500;
		int quality_score = 9;
		
		String status = ((weight >= 450 && weight <= 550) && quality_score >= 8) ? "Accepted" : "Rejected";
		
		System.out.println(status);
		
	}
}
