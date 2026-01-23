package polymorphism;

public class Task2Clothing extends Task2Product{
	double price;
	Task2Clothing(double price){
		super(); // even though we are not giving this compiler us giving implicit super() keyword
		this.price = price;
	}
	
	public void calculatePrice() {
		System.out.println(price - (price * 0.2));
	}
}
