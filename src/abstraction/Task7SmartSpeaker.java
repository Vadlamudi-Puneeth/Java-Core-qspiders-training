package abstraction;

public class Task7SmartSpeaker implements Task7Connectable{
	@Override
	public void connect() {
		System.out.println("speaker  connected");
	}
	
	@Override
	public void disconnect() {
		System.out.println("smart speaker disconnected");
	}
	
	@Override
	public void getConnectionStatus() {
		System.out.println("already connected");
	}
}
