package inheritance;

public class Task3SalaryEmployee extends Task3Employee{
	double basic;
	Task3SalaryEmployee(int empId, String name, double basic){
		super(empId,name);
		this.basic = basic;
	}
	
	void calculateTotalSalary() {
		double hra = 5; // 5%
		double da = 4; // 4%
		hra = (hra/100) * basic;
		da = (da/100) * basic;
		System.out.println(hra + da + basic);
	}
	
}
