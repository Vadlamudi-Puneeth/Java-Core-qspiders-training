package polymorphism;

public class Task3Bike extends Task3Vehicle{
	int price;
	Task3Bike(int price){
		this.price = price;
	}
	
	@Override
	public void calculateRent(int days) {
		System.out.println(days*price);
	}
}
