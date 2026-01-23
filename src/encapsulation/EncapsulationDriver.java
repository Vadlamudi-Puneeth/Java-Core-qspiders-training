package encapsulation;

public class EncapsulationDriver {
	public static void main(String args[]) {
		Encapsulation e = new Encapsulation();
//		System.out.println(e.price);
		e.setPrice(1000);
		System.out.println(e.getPrice());
		
		Encapsulation e1 = new Encapsulation();
		System.out.println(e1.getPrice());
	}
}
