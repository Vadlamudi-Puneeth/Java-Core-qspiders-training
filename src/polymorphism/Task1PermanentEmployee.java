package polymorphism;

public class Task1PermanentEmployee extends Task1Employee{
	
	@Override
	public void calculateSalary() {
		int salary = 10000;
		int hra = 1000;
		int da = 2000;
		System.out.println(salary + hra + da);
	}
}
