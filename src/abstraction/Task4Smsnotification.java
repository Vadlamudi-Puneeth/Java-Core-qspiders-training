package abstraction;

public class Task4Smsnotification implements Task4Notification{
	
	@Override 
	public void sendMessage(String message) {
		System.out.println(message);
	}
	
	@Override
	public void getDeliveryStatus() {
		System.out.println("send");
	}
}
