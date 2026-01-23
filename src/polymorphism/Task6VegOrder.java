package polymorphism;

public class Task6VegOrder extends Task6FoodOrder{
	int price;
	int tax;
	Task6VegOrder( int tax){
		this.price = price;
	}
	
	@Override
	public void calculateBill() {
		System.out.println(price);
	}
}
