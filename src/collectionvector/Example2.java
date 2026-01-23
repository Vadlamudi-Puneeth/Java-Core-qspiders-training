package collectionvector;
import java.util.Vector;

public class Example2 {
	public static void main(String[] args) {
//		Vector<Integer> vc = new Vector<>();
//		System.out.println(vc.capacity());
		
		Vector<Integer> vc = new Vector<>(2);
		vc.add(10);
		vc.add(20);
		
		System.out.println(vc);
		System.out.println(vc.capacity());
		
		// newCapacity = oldCapacity * 2;
		
		vc.add(30);
		System.out.println(vc);
		System.out.println(vc.capacity());
		
		vc.add(2, 99); // this will add the element in the 2nd index and the elements already present there move towards right hand side 1step
		System.out.println(vc);
		
		vc.set(0, 101); // this will replace the element
		System.out.println(vc);
		
		vc.remove(0);
		vc.remove(1);
		System.out.println(vc);
		System.out.println(vc.capacity());
		
		
		
		
	}
}
