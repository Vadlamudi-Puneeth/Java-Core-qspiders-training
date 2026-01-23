package oopfundamentals;

public class Marker {
	Marker(){
		System.out.println("from marker...!");
	}
	public static void main(String args[]) {
		
		System.out.println("main started....");
		Marker m = new Marker();
		System.out.println("main end.....");
		
	}
}
