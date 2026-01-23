package abstraction;

public class Task4EmailNotification implements Task4Notification{
	
	@Override
	public void sendMessage(String message) {
		System.out.println("Email sent");
	}
	
	@Override
	public void getDeliveryStatus() {
		System.out.println("sent");
	}
}
