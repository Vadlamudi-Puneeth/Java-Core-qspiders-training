package inheritance;

public class Task11Triangle extends Task11Shape{
	double base;
	double height;
	
	Task11Triangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	
	public void calculateArea() {
		System.out.println(0.5 * base * height);
	}
}
