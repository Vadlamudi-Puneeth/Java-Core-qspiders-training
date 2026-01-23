package abstraction;

public class Task5PartTime extends Task5Employee{
	int hra = 2000;
	int da = 1000;
	int salary = 10000;
	String name = "puneeth";
	
	@Override
	public void calculateSalary() {
		System.out.println(hra + da + salary);
	}
	
	@Override
	public void getEmployeeDetails() {
		System.out.println(name);
	}
}
