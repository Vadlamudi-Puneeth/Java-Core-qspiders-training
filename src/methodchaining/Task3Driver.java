package methodchaining;

public class Task3Driver {
	public static void main(String args[]) {
		Task3 t3 = new Task3();
		t3.setBrand("realme").setColor("black").setPrice(10000).setWaranty(2);
		System.out.println(t3.getBrand() + " " + t3.getColor() + " " + t3.getPrice());
	}
}
