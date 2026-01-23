package inheritance;

public class Task6Manager extends Task6Employee{
	private String dept;
	double bonus;
	
	Task6Manager(int eId, String name, int age, String dept, double bonus){
		super(eId, name, age);
		this.dept = dept;
		this.bonus = bonus;
	}
	
	public void display() {
		super.displayEmployee();
		System.out.println(dept);
		System.out.println(bonus);
	}
	
}
