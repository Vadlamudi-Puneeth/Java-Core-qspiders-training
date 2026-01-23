package abstraction;

public class Task13main {
	public static void main(String[] args) {
		Task13Staff t13;
		t13 = new Task13Doctor();
		t13.checkIn();
		t13.calculateDutyHours();
		t13.checkOut();
		t13 = new Task13Nurse();
		t13.checkIn();
		t13.calculateDutyHours();
		t13.checkOut();
	}
}
