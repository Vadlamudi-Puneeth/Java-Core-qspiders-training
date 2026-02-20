package onlyfunctionalinterfacepredicate;

import java.util.function.Predicate;

import onlystreams.Employee;

public class Main4 {
	public static void main(String[] args) {
		Employee employee = new Employee(103, "Rahul Verma", 26, "Male", "IT","QA Engineer", 45000, "Hyderabad","rahul.verma@gmail.com", "9876543212");
//		Consumer<Employee> co = adjustSalary();
//		co.accept(employee);
//		System.out.println(employee.getSalary());
		
		Predicate<Employee> pd = checkEmail();
		System.out.println(pd.test(employee));
	}
	
	public static Consumer<Employee> adjustSalary(){
		return  i -> i.setSalary(i.getSalary() * 2);
	}
	
	public static Predicate<Employee> checkEmail(){
		return i -> i.getEmail().matches("[a-zA-Z0-9./*-+%]+@gmail\\.com");
	}
}
