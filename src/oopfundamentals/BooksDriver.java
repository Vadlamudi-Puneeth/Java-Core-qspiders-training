package oopfundamentals;

public class BooksDriver {
	public static void main(String args[]) {
		Books b = new Books("Harry");
		System.out.println(b.title);
		
		Books b1 = new Books("stranger things");
		System.out.println(b1.title);
		b1.count=2;
		
		System.out.println(b.count);
		
		Books b2 = new Books("nrfbs");
		System.out.print(b2.count);
		
	}
}
