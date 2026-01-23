package inheritance;

public class Task12Main {
	public static void main(String args[]) {
		Task12Employee t12e = new Task12Employee();
		Task12Developer t12d = new Task12Developer();
		Task12Tester t12t = new Task12Tester();
		Task12Manager t12m = new Task12Manager();
		
		t12e.display();
		t12d.display();
		t12t.display();
		t12m.display();
		
	}
}
