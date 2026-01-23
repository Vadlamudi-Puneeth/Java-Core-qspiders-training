package polymorphism;

public class Task1ContractEmployee extends Task1Employee{
	
	@Override
	public void calculateSalary() {
		int salary = 20000;
		int hra = 2000;
		int da = 1000;
		System.out.println(salary + hra + da);
	}
	
	
	
}
