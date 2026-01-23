package arrays;

public class Task24 {
	public static void main(String args[]) {
		int salary[] = {21,34,6,7,123,31};
		
		int max = salary[0];
		
		for(int i = 0;i < salary.length; i++) {
			if(salary[i] > max) {
				max = salary[i];
			}
		}
		
		System.out.println(max);
	}
}
