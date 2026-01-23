package oopfundamentals;

public class Customer {
	
	int cid;
	String cName;
	String address;
	
	Customer(int cid){
		this.cid = cid;
	}
	
	Customer(int cid,String cName){
//		this.cid = cid;
		this(cid);
		this.cName = cName;
	}
	
	Customer(int cid,String cName, String address){
//		this.cid = cid;
//		this.cName = cName;
		this(cid,cName);
		this.address = address;
	}
	
	public static void main(String args[]) {
		
		Customer c1 = new Customer(1);
		System.out.println(c1.cid + "\n");
		
		Customer c2 = new Customer(2,"nani");
		System.out.println(c2.cid);
		System.out.println(c2.cName+"\n");
		
		Customer c3 = new Customer(3,"puneeth","hyderabad");
		System.out.println(c3.cid);
		System.out.println(c3.cName);
		System.out.println(c3.address);
	}
}
