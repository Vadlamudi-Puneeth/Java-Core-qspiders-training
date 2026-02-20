package before1daypractise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMain {
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "puneeth", "it", 20000));
		employees.add(new Employee(2, "nani", "hr", 30000));
		employees.add(new Employee(3, "mahesh", "sales", 25000));
		employees.add(new Employee(3, "nikhil", "sales", 80038));
		
		List<Employee> increment = employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("it")).map(e -> {
			e.setSalary(e.getSalary() + e.getSalary() * 0.1);
			return e;
		}).collect(Collectors.toList());
		
//		System.out.println(increment);
		
		Employee highest = employees.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
//		System.out.println(highest);
		
		
//		3️⃣ Print average salary per department
		
		Map<Object, Double> avgSalPerDept = employees.stream()
													.collect(Collectors.groupingBy(
																e -> e.getDepartment(),
																Collectors.averagingDouble(e -> e.getSalary())
															));
		
//		System.out.println(avgSalPerDept);
		
//		4️⃣ Print top 3 highest paid employees
		List<Employee> top3 =
			    employees.stream()
			             .sorted(Comparator.comparing(Employee::getSalary).reversed())
			             .limit(3)
			             .toList();

		
		
		System.out.println(top3);
	}
}
