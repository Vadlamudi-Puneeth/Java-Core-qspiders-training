package polymorphism;

public class Task9Main {
	public static void main(String args[]) {
		Task9Device device[] = new Task9Device[3];
		
		device[0] = new Task9Light();
		device[1] = new Task9Fan();
		device[2] = new Task9Ac();
		
		for(Task9Device dev: device) {
			dev.turnOff();
		}
		
	}
}
