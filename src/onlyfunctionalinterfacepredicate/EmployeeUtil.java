package onlyfunctionalinterfacepredicate;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class EmployeeUtil {
	
	public Stream<Employee> searchEmployees(Stream<Employee> employees, Predicate<Employee> p){
		return employees.filter(k -> p.test(k));
	}
	
	public Predicate<Employee> salaryGreaterThan(double amount){
		Predicate<Employee> p = i -> i.getSalary() > amount;
		return p;
	}
	
	
	public Predicate<Employee> nameStartsWith(String prefix){
		Predicate<Employee> p = i -> i.getName().startsWith(prefix);
		return p;
	}

	
}
