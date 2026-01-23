package abstraction;

public class Task5Main {
	public static void main(String[] args) {
		Task5Employee t5;
		t5 = new Task5FullTime();
		t5.calculateSalary();
		t5.getEmployeeDetails();
		
		t5 = new Task5PartTime();
		t5.calculateSalary();
		t5.getEmployeeDetails();
	}
}
