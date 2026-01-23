package abstraction;

public class Task2Main {
	public static void main(String[] args) {
		Task2Printer t2;
		t2 = new Task2InkJetPrinter();
		
		t2.getPrintStatus();
		t2.print();
		
		t2 = new Task2LaserPrinter();
		t2.getPrintStatus();
		t2.print();
		
	}
}
