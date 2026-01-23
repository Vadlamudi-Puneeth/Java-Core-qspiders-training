package encapsulation;

public class Customer {
	int id;
	String name;
	
	Customer(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public static void main(String argsp[]) {
		Customer c = returnn();
		System.out.println(c.id);
		System.out.println(c.name);
	}
	
	public static Customer returnn() {
		Customer c = new Customer(101,"nani");
		return c;
//		return new Customer(102,"puneeth");
	}
	
}
