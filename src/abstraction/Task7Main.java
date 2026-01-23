package abstraction;

public class Task7Main {
	public static void main(String[] args) {
		Task7Connectable t7;
		t7 = new Task7SmartTv();
		t7.connect();
		t7.disconnect();
		t7.getConnectionStatus();
		
		t7 = new Task7SmartSpeaker();
		t7.connect();
		t7.disconnect();
		t7.getConnectionStatus();
		
	}
}
