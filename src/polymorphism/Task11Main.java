package polymorphism;

public class Task11Main {
	public static void main(String args[]) {
		Task11Vehicle t11;
		t11 = new Task11Car();
		t11.run(5);
		t11.type();
		
		Task11Car c = (Task11Car)t11;
		c.run(5.5);
		c.type();
	}
}
