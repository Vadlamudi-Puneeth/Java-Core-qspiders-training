package week3;

public class Task3Computer {
	private String brand;
	private Task3Cpu cpu;
	private Task3Ram ram;
	
	Task3Computer(String brand){
		this.brand = brand;
		this.cpu = new Task3Cpu("Intel i5");
		this.ram = new Task3Ram(16);
	}
	
	public void showDetails() {
		System.out.println("brand: " + brand);
		System.out.println("cpu: " + cpu.getModel());
		System.out.println("cpu: " + ram.getSize());
	}
	
}
