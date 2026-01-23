package encapsulation;

public class Task4Driver {
	public static void main(String args[]) {
		Task4 t4 = new Task4();
//		t4.volume = 1000;
//		t4.setVolume(1000);
		t4.setVolume(99);
		System.out.println(t4.getVolume());
	}
}
