package polymorphism;

public class Task1Main {
	public static void main(String args[]) {
		// one reference and many object
		Task1Employee t1;
		t1 = new Task1PermanentEmployee();
		t1.calculateSalary();
		
		t1 = new Task1ContractEmployee();
		t1.calculateSalary();
		
	}
}
