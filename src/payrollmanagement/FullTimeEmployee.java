package payrollmanagement;

public class FullTimeEmployee extends Employee {
	private double hra;
	private double bonus;

	public FullTimeEmployee(int id, String name, String dept, double baseSalary, double hra, double bonus)
			throws InvalidEmployeeException {
		super(id, name, dept, baseSalary);
		// TODO:
		// Validate hra >= 0
		if (hra < 0) {
			throw new InvalidEmployeeException("invalid hra");
		}
		// Validate bonus >= 0
		if(bonus < 0) {
			throw new InvalidEmployeeException("invalid bonus");
		}
		this.hra = hra;
		this.bonus = bonus;
	}

	@Override
	public double calculateSalary() throws InvalidSalaryException {
		// TODO:
		// gross = baseSalary + hra + bonus
		double gross = baseSalary + hra + bonus;
		// tax = applyTax(gross)
		double tax = applyTax(gross);
		// return gross - tax
		
		return gross - tax;
	}

	protected double applyTax(double gross) {
		// TODO:
		// Apply slab logic
		if(gross < 50000) {
			return gross * 0.05;
		}else if(gross >= 50000 && gross <= 100000) {
			return gross * 0.1;
		}
		return gross * 0.2;
	}
}
