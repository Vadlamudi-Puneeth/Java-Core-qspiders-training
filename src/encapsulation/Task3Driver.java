package encapsulation;

public class Task3Driver {
	public static void main(String args[]) {
		Task3 t3 = new Task3();
		t3.setSalary(10000);
//		t3.salary = 20000
		System.out.println(t3.getSalary());
	}
}
