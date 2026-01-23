package methodchaining;

public class Task1Driver {
	public static void main(String args[]) {
		Task1 t1 = new Task1();
		t1.setProduct_name("coconut oil").setPrice(100).setQuantity(10).setDiscount(10);
		
		System.out.println(t1.getProduct_name() + " " + t1.getPrice() + " " + t1.getQuantity());
	}
}
