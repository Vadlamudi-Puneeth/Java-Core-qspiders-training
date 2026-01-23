package collectionvector;
import java.util.*;

public class Example4 {
	public static void main(String[] args) {
		
		Vector<Integer> vc = new Vector<>();
		
		vc.add(12);
		vc.add(13);
		vc.add(14);
		
//		Iterator it = vc.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		ListIterator li = vc.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
//		System.out.println(vc);
		
	}
}
