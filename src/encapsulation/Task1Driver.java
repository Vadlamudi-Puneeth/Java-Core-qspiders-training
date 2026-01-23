package encapsulation;

public class Task1Driver {
	public static void main(String args[]) {
		Task1 t1 = new Task1();
//		System.out.println(t1.marks); // not visible
		t1.setMarks(88);
		System.out.println(t1.getMarks());
		
	}
}
