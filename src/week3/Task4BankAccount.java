package week3;

public class Task4BankAccount {
	
	private String name;
	private Task4Customer cust;
	
	Task4BankAccount(String name){
		this.name = name;
		this.cust = new Task4Customer(101);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showDetails() {
		System.out.println(name);
		System.out.println(cust.getId());
	}
	
	
	
}
