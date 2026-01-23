package arrays;

public class Task23 {
	public static void main(String args[]) {
		int scores[] = {20,11,22,34};
		
		int max = scores[0];
		
		for(int i = 0;i < scores.length; i++) {
			if(scores[i] > max) {
				max = scores[i];
			}
		}
		
		System.out.println(max);
		
	}
}
