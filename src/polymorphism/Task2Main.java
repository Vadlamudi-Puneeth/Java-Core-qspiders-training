package polymorphism;

public class Task2Main {
	public static void main(String args[]) {
		Task2Product t2;
		t2 = new Task2Electronics(1000);
		t2.calculatePrice();
		
		t2 = new Task2Clothing(2000);
		t2.calculatePrice();
		
		t2 = new Task2Grocery(1500);
		t2.calculatePrice();
	}
}
