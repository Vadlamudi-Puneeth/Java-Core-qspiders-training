package functionalinterfaceconsumer;
import java.util.*;
import java.util.function.*;

class Employee{
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}

public class ConsumerWithEmployee {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee(1, "nani", 2000));
		al.add(new Employee(2, "puneeth", 3000));
		al.add(new Employee(3, "pavan", 2500));
		
		Consumer<Employee> cm = (emp) -> {
			System.out.println(emp.name + " | " +  emp.salary);
		};
		
		for(Employee e: al) {
			cm.accept(e);
		}
		
	}
}
