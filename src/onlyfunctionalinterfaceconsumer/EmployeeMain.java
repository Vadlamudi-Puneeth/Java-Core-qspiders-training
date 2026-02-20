package onlyfunctionalinterfaceconsumer;

import java.util.function.Consumer;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeUtil eu = new EmployeeUtil();
		  Employee emp = new Employee("nani", 10000);
		  
//		Consumer<Employee> increase = eu.increaseSalary(4.0);
//		increase.accept(emp);
		
		Consumer<Employee> print = System.out::println;
		print.accept(emp);
		
	}
}
