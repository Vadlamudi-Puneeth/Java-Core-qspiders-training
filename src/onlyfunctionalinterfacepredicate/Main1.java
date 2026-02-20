package onlyfunctionalinterfacepredicate;

import java.util.function.Predicate;

import onlystreams.Employee;

public class Main1{
	
	public static Predicate<Employee> isCheck(Employee employee) {
		return e->e.getGender().equals("Male");
	}
	
	public static void main(String[] args) {
//		Predicate<Integer> obj1 = i -> i > 18;
//		System.out.println(obj1.test(10));
		
//		Employee employee = new Employee(103, "Rahul Verma", 26, "Male", "IT","QA Engineer", 45000, "Hyderabad","rahul.verma@gmail.com", "9876543212");
//		
//		Predicate<Employee> emp = e->e.getGender().equals("Male");
//		
//		System.out.println(emp.test(employee));
	}
}
