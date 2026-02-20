package before1daypractise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionIntMain {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();

		list.add(new Employee(101,"Arjun","IT",60000));
		list.add(new Employee(102,"Priya","HR",50000));
		list.add(new Employee(103,"Rahul","IT",72000));
		list.add(new Employee(104,"Meera","Finance",85000));
		list.add(new Employee(105,"Nani","IT",95000));
		list.add(new Employee(106,"Kiran","Admin",42000));
		
		FunctonalIntEmployee fie = new FunctonalIntEmployee();
		list.add(fie.defaultEmployee().get());
		
		Predicate<Employee> p = fie.highSalary(60000);
		
		for(Employee e: list) {
			if(p.test(e)) {
				System.out.println(e);
			}
		}
		
		System.out.println("fn");
		Function<Employee,String> fn = fie.employeeSummary();
		for(Employee e: list) {
			System.out.println(fn.apply(e));
		}
		
		Consumer<Employee> cn = fie.printUpper();
		list.forEach(cn);
		

	}
}
