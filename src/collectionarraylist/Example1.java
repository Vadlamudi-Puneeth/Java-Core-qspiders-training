package collectionarraylist;
import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add("hi");
		list.add(3);
		list.add("bye");
		
//		System.out.println(list);
		
		list.remove(2);
		
//		System.out.println(list);
		
		ArrayList list1 = new ArrayList();
		list1.add("hi");
		list1.add(9);
		list1.add("bye");
		list1.add("puneeth");
		
		list.removeAll(list1);
//		System.out.println(list);
		
		list.add("hi");
		list.add(10);
		list.add("bye");
		list.add("puneeth");
		System.out.println(list);
		System.out.println(list1);
		
		list.retainAll(list1);
		
		System.out.println(list);
		System.out.println(list1);
		
		
	}
}
