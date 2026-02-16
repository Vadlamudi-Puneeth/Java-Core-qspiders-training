package practise;

public class DeviceMain {
	public static void main(String[] args) {
		Device d = new Device("D101", "Graphics Laptop", 2);
		
		String[] employees = {"Amit", "Neha", "Amit", "Rohit"};
		
		for(String emp: employees) {
			try {			
				d.allocateToEmployee(emp);
				System.out.println(emp + " allocated successfully.");
			}catch(DuplicateAllocationException dae) {
				System.out.println(dae.getMessage());
			}catch(DeviceLimitExceededException dle) {
				System.out.println(dle.getMessage());
			}
		}
		
		
	}
}
