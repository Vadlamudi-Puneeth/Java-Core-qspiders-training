package abstraction;

public class Task1Rectangle extends Task1Shape{
	int len = 5;
	int width = 6;
	
	
	@Override
	public void calculateArea() {
		System.out.println(len * width);
	}
			
	@Override
	public void calcualtePerimeter() {
		System.out.println(2 * (len + width));
	}
}
