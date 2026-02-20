package payrollmanagement;

public class ContractEmployee extends Employee {
	private double hourlyRate;
	private int hoursWorked;

	public ContractEmployee(int id, String name, String dept, double hourlyRate, int hoursWorked)
			throws InvalidEmployeeException {
		super(id, name, dept, 0);
		// TODO:
		// Validate hourlyRate > 0
		if(hourlyRate <= 0) {
			throw new InvalidEmployeeException("invalid email");
		}
		// Validate hoursWorked >= 0
		if(hoursWorked < 0) {
			throw new InvalidEmployeeException("invalid email");
		}
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double calculateSalary() throws InvalidSalaryException {
		// TODO:
		// return hourlyRate * hoursWorked
		return hourlyRate * hoursWorked;
	}
}
