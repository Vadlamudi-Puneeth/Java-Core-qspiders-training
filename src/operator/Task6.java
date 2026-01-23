package operator;

public class Task6 {
	public static void main(String args[]) {
		int speed_limit = 40;
		int vehicle_speed = 10;
		boolean isEmergencyProvider = false;
		int fine_amount = 0;
		fine_amount = (vehicle_speed > speed_limit)? (isEmergencyProvider == true ? 0: (fine_amount+=495)) : (0);
		
		System.out.println(fine_amount);
		
	}
}
