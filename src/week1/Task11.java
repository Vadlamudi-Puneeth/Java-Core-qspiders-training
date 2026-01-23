package week1;

public class Task11 {
	public static void main(String args[]) {
		int speed_limit = 60;
		int current_speed = 20;
		boolean seat_belt_worn = true;
		
		int fine_amount = 0;
		fine_amount = (current_speed > speed_limit && !seat_belt_worn)? fine_amount+=100: fine_amount;
		
		System.out.println(fine_amount);
		
	}
}
