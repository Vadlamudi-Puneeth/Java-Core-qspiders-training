package methodchaining;

public class Task2Driver {
	public static void main(String args[]) {
		Task2 t2 = new Task2();
		t2.setName("nani").setAge(12).setClass(7);
		System.out.println(t2.getName() + " " + t2.getAge());
	}
}
