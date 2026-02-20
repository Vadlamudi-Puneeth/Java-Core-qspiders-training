package onlyfunctionalinterfacepredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeUtil eu = new EmployeeUtil();
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1, "nani", 199000, "IT"));
		list.add(new Employee(2, "puneeth", 200002, "Hr"));
		
		Predicate<Employee> p = i -> i.getDept().equalsIgnoreCase("it");
		Stream<Employee> s = eu.searchEmployees(list.stream(), p);
		
		List<Employee> l = s.toList();
		
		System.out.println(l);
		
	}
}
