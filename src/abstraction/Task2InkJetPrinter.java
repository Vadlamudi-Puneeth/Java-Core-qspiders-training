package abstraction;

public class Task2InkJetPrinter implements Task2Printer{
	
	@Override
	public void print() {
		System.out.println("ink jet printer");
	}
	
	@Override
	public void getPrintStatus() {
		System.out.println(true);
	}
}
