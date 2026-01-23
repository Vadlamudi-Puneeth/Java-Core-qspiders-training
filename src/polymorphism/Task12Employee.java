package polymorphism;

public class Task12Employee {
	int salary = 30000;
	static void companyInfo() {
		System.out.println("employee company info");
	}
	public void calculateSalary(int days) {
		System.out.println(salary / days);
	}
}
