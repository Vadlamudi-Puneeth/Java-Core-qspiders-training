package inheritance;

public class Task11Rectangle extends Task11Shape{
	int len;
	int width;
	
	Task11Rectangle(int len, int width){
		this.len = len;
		this.width = width;
	}
	
	public void calculateArea() {
		System.out.println(len * width);
	}
}
