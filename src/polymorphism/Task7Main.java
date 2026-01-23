package polymorphism;

public class Task7Main {
	public static void main(String args[]) {
		Task7Ride t7[] = new Task7Ride[3];
		
		t7[0] = new Task7BikeRide();
		t7[1] = new Task7CarRide();
		t7[2] = new Task7AutoRide();
		
		int days[] = {1,2,3};
		
		int totalEarnings = 0;
		
		for(int i = 0;i < days.length; i++) {
			totalEarnings += t7[i].calculateFare(days[i]);
		}
		
		System.out.println(totalEarnings);
		
	}
}
