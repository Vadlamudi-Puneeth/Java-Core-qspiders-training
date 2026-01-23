package polymorphism;

public class Task3Car extends Task3Vehicle{
	int price;
	Task3Car(int price){
		this.price = price;
	}
	
	@Override
	public void calculateRent(int days) {
		System.out.println(days*price);
	}
}
