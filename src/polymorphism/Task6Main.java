package polymorphism;

public class Task6Main {
	public static void main(String args[]) {
		Task6FoodOrder t6;
		t6 = new Task6VegOrder(1000);
		t6.calculateBill();
		
		t6 = new Task6NonVegOrder(2000);
		t6.calculateBill();
		
		t6 = new Task6ComboOrder(3000);
		t6.calculateBill();
	}
}
