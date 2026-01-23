package inheritance;

public class Sub1 extends Super1{
	Sub1(){
//		super(); // by default
//		this(10
		System.out.println("from child class constructor...");
	}
         
	
	
	public static void main(String argsp[]) {
		Sub1 su = new Sub1();
		// In above first it will call parent first because it has super() keyword internally\
		 
		
	}
}
