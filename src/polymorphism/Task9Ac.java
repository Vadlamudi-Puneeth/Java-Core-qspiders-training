package polymorphism;

public class Task9Ac extends Task9Device{
	@Override
	public void turnOff() {
		System.out.println("turn off");
	}
	@Override
	public void turnOn() {
		System.out.println("turn on");
	}
}
