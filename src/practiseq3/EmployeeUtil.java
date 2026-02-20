package practiseq3;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeUtil {
	public Stream<Employee> findEmployeesJoinedAfter(Stream<Employee> employees, int year){
		return employees.filter(e -> e.getJoiningYear() > year);
	}
	
	public Map<String, Double> getAverageSalaryByDept(Stream<Employee> employees){
		return employees.collect(Collectors.groupingBy(
											e -> e.getDept(),
											Collectors.averagingDouble(e -> e.getSalary())
										));
	}
	
	public String getHighestPaidEmployee(List<Employee> employees) {
		return employees.stream().max(Comparator.comparing(Employee::getSalary).reversed()).map(Employee::getName).orElse(null);
	}
	
}
