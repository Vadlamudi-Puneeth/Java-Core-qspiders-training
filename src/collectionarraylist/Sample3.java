package collectionarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Sample3 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(15);
		a.add(22);
		a.add(30);
		
		Iterator i = a.iterator();
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next());
//		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		ListIterator li = a.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}	
		
//		while(i.hasprevious()) {
//			
//		}
		
		
	}
}
