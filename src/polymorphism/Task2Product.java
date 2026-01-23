package polymorphism;

public class Task2Product {
	double price;
	
	Task2Product(){
		System.out.println("task2");
	}
	Task2Product(double price){
		this.price = price;
	}
	public void calculatePrice() {
		System.out.println("price calculated");
	}
}
