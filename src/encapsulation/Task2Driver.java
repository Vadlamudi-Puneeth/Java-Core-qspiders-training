package encapsulation;

public class Task2Driver {
	public static void main(String args[]) {
		Task2 t2 = new Task2();
		int deposit = 1000;
		t2.setBalance(deposit);
//		t2.balance = 2000;
		System.out.println(t2.getBalance());
	}
}
