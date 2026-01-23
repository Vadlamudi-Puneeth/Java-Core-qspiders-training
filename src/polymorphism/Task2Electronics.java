package polymorphism;

public class Task2Electronics extends Task2Product{
	double price;
	Task2Electronics(double price){
		super(price);
		this.price = price;
	}
	
	public void calculatePrice() {
		System.out.println(price - (price * 0.1));
	}
}
