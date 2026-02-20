package payrollmanagement;

public abstract class Employee implements Comparable<Employee> {
	protected int id;
	protected String name;
	protected String department;
	protected double baseSalary;

	public Employee(int id, String name, String department, double baseSalary) throws InvalidEmployeeException {
		if (id <= 0)
			throw new InvalidEmployeeException("Invalid ID");
		// TODO:
		// Validate name length >= 3
		if (name.length() < 3) {
			throw new InvalidEmployeeException("Invalid name");
		}
		// Validate department not null or empty
		if (department == null) {
			throw new InvalidEmployeeException("Invalid department");
		}
		// Validate baseSalary >= 0
		if (baseSalary < 0) {
			throw new InvalidEmployeeException("Invalid baseSalary");
		}
		this.id = id;
		this.name = name;
		this.department = department;
		this.baseSalary = baseSalary;
	}

	public abstract double calculateSalary() throws InvalidSalaryException;

	@Override
	public int compareTo(Employee other) {
		// TODO:
		// Sort in descending order of salary
		return Double.compare(other.baseSalary, this.baseSalary);
	}

	public String getDepartment() {
		return department;
	}
}
