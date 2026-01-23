package abstraction;

public class Task1Circle extends Task1Shape{
	final double pi = 3.14;
	int radius = 3;
	
	@Override
	public void calculateArea() {
		System.out.println(pi * radius * radius);
	}
	
	@Override
	public void calcualtePerimeter() {
		System.out.println(2 * pi * radius);
	}
	
}
