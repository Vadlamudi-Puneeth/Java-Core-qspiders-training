package arrays;

public class Task26 {
	public static void main(String args[]) {
		int consume[] = {230,335,667,34,567,234};
		
		int sum = 0;
		
		for(int i = 0;i < consume.length; i++) {
			sum+=consume[i];
		}
		
		System.out.println(sum);
		
	}
}
