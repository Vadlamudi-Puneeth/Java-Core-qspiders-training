package operator;

public class Task10 {
	public static void main(String args[]) {
		
		int score = 11;
		
		int completing_level_time = 55;
		int total_time = 60;
		
		boolean isCheatsUsed = false;
		
		boolean is_eligible_bonus = (score > 100 && (completing_level_time < total_time) && !isCheatsUsed)? true: false;
		
		int final_score = is_eligible_bonus ? (score+=10): score;
		
		System.out.println(final_score);
		
		
	}
}
