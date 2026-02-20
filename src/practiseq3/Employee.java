package practiseq3;

public class Employee {
	
	int id;
	String name;
	double salary;
	String dept;
	int joiningYear;
	public Employee(int id, String name, double salary, String dept, int joiningYear) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.joiningYear = joiningYear;
	}
	
	
	public Employee() {}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public int getJoiningYear() {
		return joiningYear;
	}


	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + ", joiningYear="
				+ joiningYear + "]";
	}
	
	
	
	
	
	
}
