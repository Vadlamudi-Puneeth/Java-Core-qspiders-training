package abstraction;

public class Task1Main {
	public static void main(String[] args) {
		Task1Shape c = new Task1Circle();
		c.calculateArea();
		c.calcualtePerimeter();
		
		c = new Task1Rectangle();
		c.calcualtePerimeter();
		c.calculateArea();
	}
}
