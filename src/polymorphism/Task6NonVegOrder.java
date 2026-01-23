package polymorphism;

public class Task6NonVegOrder extends Task6FoodOrder{
	int price;
	Task6NonVegOrder(int price){
		this.price = price;
	}
	
	@Override
	public void calculateBill() {
		System.out.println(price);
	}
}
