package inheritance;

public class Task11Main {
	public static void main(String args[]) {
		Task11Shape t11S = new Task11Shape();
		Task11Circle t11C = new Task11Circle(2.5);
		Task11Rectangle t11R = new Task11Rectangle(4,5);
		Task11Triangle t11T = new Task11Triangle(2.5,3.0);
		
		t11S.calculateArea();
		t11C.calculateArea();
		t11R.calculateArea();
		t11T.calculateArea();
		
	}
}
