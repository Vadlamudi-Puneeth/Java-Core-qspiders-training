package abstraction;

public class Task4Main {
	public static void main(String[] args) {
		Task4Notification t4;
		t4 = new Task4EmailNotification();
		t4.getDeliveryStatus();
		t4.sendMessage("hi");
		
		t4 = new Task4Smsnotification();
		t4.getDeliveryStatus();
		t4.sendMessage("bye");
	}
}
