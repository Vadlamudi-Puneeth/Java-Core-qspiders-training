package polymorphism;

public class Task12Main {
	public static void main(String[] args) {
		Task12Employee t12 = new Task12manager();
		System.out.println(t12.salary);
		t12.companyInfo();
		t12.calculateSalary(3);
		
		Task12manager m = (Task12manager)t12;
		m.calculateSalary(5.0);
		System.out.println(m.salary);
		m.companyInfo();
		
	}
}
