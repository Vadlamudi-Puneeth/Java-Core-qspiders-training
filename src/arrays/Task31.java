package arrays;

public class Task31 {
	public static void main(String args[]) {
		double salary[] = {100000,2345,234567,678,86,567654};
		
		
		for(int i = 0;i < salary.length; i++) {
			salary[i] = salary[i] + 0.1 * (salary[i]);
		}
		
		for(int i = 0;i < salary.length; i++) {
			System.out.print(salary[i] + " ");
		}
		
	}
}
