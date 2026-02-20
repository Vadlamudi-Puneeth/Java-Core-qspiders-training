package before1daypractise;

public class Order {

	private int id;
	private String customer;
	private String category;
	private double amount;
	private String city;
	private int priority;
	private String status;

	public Order(int id, String customer, String category, double amount, String city, int priority, String status) {

		this.id = id;
		this.customer = customer;
		this.category = category;
		this.amount = amount;
		this.city = city;
		this.priority = priority;
		this.status = status;
	}

	public double getAmount() {
		return amount;
	}

	public int getPriority() {
		return priority;
	}

	public String getCity() {
		return city;
	}

	public String getStatus() {
		return status;
	}

	public String getCustomer() {
		return customer;
	}

	@Override
	public String toString() {
		return id + " " + customer + " " + amount + " " + priority;
	}
}
