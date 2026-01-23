package abstraction;

public class Task7SmartTv implements Task7Connectable{

	@Override
	public void connect() {
		System.out.println("smart tv connected");
	}
	
	@Override
	public void disconnect() {
		System.out.println("smart tv disconnected");
	}
	
	@Override
	public void getConnectionStatus() {
		System.out.println("already connected");
	}
	
}	
