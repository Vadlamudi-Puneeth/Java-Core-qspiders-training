package functionalinterfacepredicate;

import java.util.function.Predicate;

class Employee{
	public int eid;
	public String empname;
	public float empsalary;
	
	public Employee(int eid, String empname, float empsalary) {
		super();
		this.eid = eid;
		this.empname = empname;
		this.empsalary = empsalary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", empname=" + empname + ", empsalary=" + empsalary + "]";
	}
	
}

public class PredicateWithUserDefined {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "nani", 8293.9f);
		Employee e2 = new Employee(102, "puneeth", 3373.4f);
		
		Predicate<Employee> pi = (employee) -> (employee.empsalary > 3000);
		boolean res = pi.test(e2);
		System.out.println(res);
		
	}
}
