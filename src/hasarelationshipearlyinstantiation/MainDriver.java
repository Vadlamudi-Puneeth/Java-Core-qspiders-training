package hasarelationshipearlyinstantiation;

public class MainDriver {
	public static void main(String args[]) {
		Car c = new Car();
//		c.getEngine().setHp(10);
//		System.out.println(c.getEngine().getHp());
		
		Engine e = new Engine(10);
		Car c1 = new Car("BMW",e);
		System.out.println(c1.getEngine().getHp());
	}
}
