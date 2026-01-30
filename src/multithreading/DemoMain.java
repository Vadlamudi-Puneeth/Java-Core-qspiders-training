package multithreading;

public class DemoMain {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.start(); // This creates new thread after creating it internally calls run() method
	}
}
