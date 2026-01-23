package week1;

public class Task10 {
	public static void main(String args[]) {
		double total_bill = 2000;
		int num_of_people = 3;
		double gst = 0.18 * total_bill;
		
		System.out.println(gst);
		
		System.out.println((gst + total_bill) / num_of_people);
		
	}
}
