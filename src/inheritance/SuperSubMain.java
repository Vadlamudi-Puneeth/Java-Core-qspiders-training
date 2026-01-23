package inheritance;

public class SuperSubMain {
	public static void main(String args[]) {
		
		//w.r.t to parent class name
		Super.superDemo();
//		Super.superDemo1();
//		
//		Super.subDemo();
//		Super.subDemo1();
		
		//w.r.t to child class name
		Sub.superDemo();
//		Sub.superDemo1();
		
		Sub.subDemo();
//		Sub.subDemo1();

		//w.r.t to parent obj reference		
		Super sup = new Super();
		sup.superDemo();
		sup.superDemo1();
		
//		sup.subDemo();
//		sup.subDemo1();
		
		//w.r.t to child obj reference
		Sub su = new Sub();
		su.superDemo();
		su.superDemo1();
		
		su.subDemo();
		su.subDemo1();
		
	}
}
