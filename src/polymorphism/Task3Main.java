package polymorphism;

public class Task3Main {
	public static void main(String args[]) {
		Task3Vehicle t3;
		t3 = new Task3Bike(1000);
		t3.calculateRent(3);
		t3 = new Task3Car(2000);
		t3.calculateRent(3);
	}
}
