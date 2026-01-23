package polymorphism;

public class Task11Vehicle {
	int speed = 60;
	static void type() {
		System.out.println("static");
	}
	public void run(int distance) {
		System.out.println(speed * distance);
	}
}
