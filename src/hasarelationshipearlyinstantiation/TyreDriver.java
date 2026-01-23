package hasarelationshipearlyinstantiation;

public class TyreDriver {
	public static void main(String args[]) {
		Car1 c = new Car1();
		
		Tyres[] arr = c.getTyres();
		for(int i = 0;i < arr.length; i++) {
			System.out.println(c.getTyres()[i].getBrand());
		}
		
	}
}
