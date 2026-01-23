package polymorphism;

public class Task12manager extends Task12Employee{
	int salary = 50000;
	static void companyInfo() {
		System.out.println("manager company info");
	}
	
	@Override
	public void calculateSalary(int days) {
		System.out.println(salary / days);
	}
	
	public void calculateSalary(double days) {
		System.out.println(salary / days);
	}
	
}
