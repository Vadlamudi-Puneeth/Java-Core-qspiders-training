package payrollmanagement;

public class Manager extends FullTimeEmployee {
	private double leadershipBonus;

	public Manager(int id, String name, String dept, double baseSalary, double hra, double bonus,
			double leadershipBonus) throws InvalidEmployeeException {
		super(id, name, dept, baseSalary, hra, bonus);
		this.leadershipBonus = leadershipBonus;
	}

	@Override
	public double calculateSalary() throws InvalidSalaryException {
		// TODO:
		// Get full-time salary
		// Add leadershipBonus
		double fillTimeSalary = super.calculateSalary();
		return leadershipBonus + fillTimeSalary;
	}
}
