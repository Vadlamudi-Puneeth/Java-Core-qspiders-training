package week1;

public class Task7 {
	public static void main(String args[]) {
		int ticket_price = 250;
		
		double discount = 0.3 * ticket_price;
		
		int age = 15;
		double final_ticket_price = 0;
		final_ticket_price = (age < 12 || age > 60) ? (ticket_price - discount): ticket_price;
		
		System.out.println(ticket_price - final_ticket_price);
		System.out.println(final_ticket_price);
		
	}
}
