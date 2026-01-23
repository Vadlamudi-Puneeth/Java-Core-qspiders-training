package polymorphism;

public class Task6ComboOrder extends Task6FoodOrder{
	int price;
	Task6ComboOrder(int price){
		this.price = price;
	}
	
	@Override
	public void calculateBill() {
		System.out.println(price);
	}
}
