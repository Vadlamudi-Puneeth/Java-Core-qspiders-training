package abstraction;

public class Task5FullTime extends Task5Employee{
	int hra = 5000;
	int da = 2000;
	int salary = 20000;
	String name = "nani";
	
	@Override
	public void calculateSalary() {
		System.out.println(hra + da + salary);
	}
	
	@Override
	public void getEmployeeDetails() {
		System.out.println(name);
	}
	
}
