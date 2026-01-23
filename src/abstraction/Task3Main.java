package abstraction;

public class Task3Main {
	public static void main(String[] args) {
		Task3Vehicle t3;
		t3 = new Task3Car();
		t3.start();
		t3.stop();
		t3.getFuelType();

		t3 = new Task3Bike();
		t3.start();
		t3.stop();
		t3.getFuelType();
	}
}
