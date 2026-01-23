package polymorphism;

public class Task11Car extends Task11Vehicle{
	int speed = 100;
	
	static void type() {
		System.out.println("static car");
	}
	
	@Override
	public void run(int distance) {
		System.out.println(speed * distance);
	}
	
	public void run(double distance) {
		System.out.println(distance);
	}
	
}
