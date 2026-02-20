package before1daypractise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctonalIntEmployee {
	public Predicate<Employee> highSalary(double limit){
		return p -> p.getSalary() > limit;
	}
	
	public Function<Employee,String> employeeSummary(){
		return e -> e.getName() + " " + e.getDepartment() + " " + e.getSalary();
	}
	
	public Consumer<Employee> printUpper(){
		return e -> System.out.println(e.getName().toUpperCase());
	}
	
	public Supplier<Employee> defaultEmployee(){
		return () -> new Employee(8,"sd","sh",92838);
	}
	
	
	
	
	
	
	
	
	
	
	
	public List<Employee> filterEmployees(List<Employee> list, Predicate<Employee> condition){
		return list.stream().filter(condition).toList();
	}
	
	public Predicate<Employee> salaryAbove(double limit){
		return p -> p.getSalary() > limit;
	}
	
	public void applyConsumer(List<Employee> list,Consumer<Employee> c) {
		for(Employee e: list) {
			c.accept(e);
			System.out.println(e);
		}
	}
	
	public Consumer<Employee> increaseSalary(double percent){
		return c -> c.setSalary(c.getSalary() + c.getSalary() * percent/100);
	}

	public List<String> convertEmployees(List<Employee> list,Function<Employee,String> f){
		List<String> str = new ArrayList<>();
		for(Employee e: list) {
			str.add(f.apply(e));
		}
		return str;
	}

	
	public Function<Employee,String> employeeName(){
		return f -> f.getName().toUpperCase();
	}
	
}
