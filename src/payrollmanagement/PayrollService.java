package payrollmanagement;

import java.util.*;
import java.util.stream.*;

public class PayrollService {
	private List<Employee> employees = new ArrayList<>();

	public void addEmployee(Employee emp) {
		employees.add(emp);
	}

	public double totalPayrollCost() {
		// TODO:
		// Use Stream API
		return employees.stream().mapToDouble(e -> {
			try {
				return e.calculateSalary();
			} catch (InvalidSalaryException e1) {
				e1.getMessage();
			}
			return 0;
		}).sum();
	}

	public List<Employee> top3HighestPaid() {
		// TODO:
		// Sort and limit 3
		List<Employee> lis = employees.stream()
							.sorted(Employee::compareTo).limit(3)
							.collect(Collectors.toList());
		return lis;
	}

	public Map<String, Double> averageSalaryByDepartment() {
		// TODO:
		// groupingBy department
		Map<String, Double> map = employees.stream()
									.collect(Collectors.groupingBy(
												e -> e.getDepartment(),
												Collectors.averagingDouble(e -> {
													try {
														return e.calculateSalary();
													} catch (InvalidSalaryException e1) {
														// TODO Auto-generated catch block
														e1.getMessage();
													}
													return 0;
												})
											));
		return map;
	}

	public void payrollReport() {
		// TODO:
		// Print total payroll
		
		double TotalPayRoll = totalPayrollCost();
		System.out.println(TotalPayRoll);
		
		// Print department averages
		
		Map<String, Double> map = averageSalaryByDepartment();
		
		for(Map.Entry<String, Double>m: map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		// Print top 3 employees
		List<Employee> lis = top3HighestPaid();
		for(Employee e: lis) {
			System.out.println(e.name);
		}
		
	}
}
