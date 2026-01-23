package week1;

public class Task4 {
	public static void main(String args[]) {
		double data_limit = 2000; // MB
		
		double usage = 1800; //MB
		
		String alert_msg = (usage >= 0.9 * data_limit) ? "Alert": "No Alert";
		
		double used = (usage/data_limit)*100;
		System.out.println((int)used);
		System.out.println(alert_msg);
		
	}
}
