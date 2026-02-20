package before1daypractise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalIntEmployee {
	
	public static void main(String[] args) {
		
	
		List<Employee> list = new ArrayList<>();
	
		list.add(new Employee(101,"Arjun","IT",60000));
		list.add(new Employee(102,"Priya","HR",50000));
		list.add(new Employee(103,"Rahul","IT",72000));
		list.add(new Employee(104,"Meera","Finance",85000));
		list.add(new Employee(105,"Nani","IT",95000));
	
		FunctonalIntEmployee util = new FunctonalIntEmployee();
		Predicate<Employee> p = i -> i.getDepartment().equals("IT");
		
		List<Employee>l	= util.filterEmployees(list, p);
//		System.out.println(l);
		
		Predicate<Employee> pred = util.salaryAbove(70000);
		for(Employee e: list) {
			if(pred.test(e)){
//				System.out.println(e);
			}
		}
		
		Consumer<Employee> cm = util.increaseSalary(4);
		for(Employee e: list) {
			cm.accept(e);
//			System.out.println(e);
		}
		
		Function<Employee, String> fn = i -> i.getName().toUpperCase();
		
		
		System.out.println(util.convertEmployees(list, fn));
		
		
	}
	
	

}
