package payrollmanagement;

public class MainApplication {
	public static void main(String[] args) throws Exception {
		PayrollService service = new PayrollService();
		Employee e1 = new FullTimeEmployee(1, "Arjun", "IT", 60000, 10000, 5000);
		Employee e2 = new ContractEmployee(2, "Ravi", "Finance", 500, 120);
		Employee e3 = new Manager(3, "Meera", "IT", 90000, 15000, 10000, 20000);
		service.addEmployee(e1);
		service.addEmployee(e2);
		service.addEmployee(e3);
		service.payrollReport();
	}
}
