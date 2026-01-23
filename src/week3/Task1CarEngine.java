package week3;

public class Task1CarEngine {
	public static void main(String args[]) {
		Task1Car t1 = new Task1Car();
		t1.getEngine().setHp(20);
		System.out.println(t1.getEngine().getHp());
	}
}
