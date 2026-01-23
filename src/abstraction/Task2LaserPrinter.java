package abstraction;

public class Task2LaserPrinter implements Task2Printer{
	@Override
	public void print() {
		System.out.println("laser print");
	}
	
	@Override
	public void getPrintStatus() {
		System.out.println(false);
	}
}
