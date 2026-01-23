package polymorphism;

public class Task2Grocery extends Task2Product{
	double price;
	Task2Grocery(double price){
		super(price);
		this.price = price;
	}
	
	public void calculatePrice() {
		System.out.println(price - (price * 0.3));
	}
}
