package encapsulation;

public class Task3 {
	private double salary;
	
	public void setSalary(double salary) {
		if(salary > 0) {
			this.salary = salary;
		}
	}
	
	public double getSalary() {
		return salary;
	}
	
}
