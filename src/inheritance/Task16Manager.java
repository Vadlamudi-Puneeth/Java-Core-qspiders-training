package inheritance;

public class Task16Manager extends Task16Employee{
	double bonus;
	Task16Manager(int empId, double salary,double bonus){
		super(empId, salary);
		this.bonus = bonus;
	}
	public void display() {
		System.out.println(super.empId);
		System.out.println(super.salary);
		System.out.println(this.bonus);
	}
}
