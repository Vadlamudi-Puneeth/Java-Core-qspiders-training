package functionalinterfacepredicate;
import java.util.ArrayList;
import java.util.function.Predicate;

class Employees{
	String name;
	float salary;
	
	public Employees(String name, float salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}

public class PredicateWithEmployee {
	public static void main(String[] args) {
		
		ArrayList<Employees> list = new ArrayList<>();
		
		Employees e1 = new Employees("nani", 4001f);
		Employees e2 = new Employees("puneeth", 5000f);
		Employees e3 = new Employees("pavan", 3500f);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(new Employees("mahesh", 7000f));
		
		Predicate<Employees> pi = (emp) -> (emp.salary > 4000f);
		
		for(Employees e: list) {
			if(pi.test(e)) {
				System.out.println(e.name + " " + e.salary);
			}
		}
		
	}
}
