package inheritance;

public class Task11Circle extends Task11Shape{
	final double pi = 3.14;
	double radius = 2.5;
	
	Task11Circle(double radius){
		this.radius = radius;
	}
	
	public void calculateArea() {
		System.out.println(pi * radius * radius);
	}
}
