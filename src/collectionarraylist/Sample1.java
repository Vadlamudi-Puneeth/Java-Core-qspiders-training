package collectionarraylist;
import java.util.*;

public class Sample1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Student s = new Student(101, "pavan");
		
		list.add(1);
		list.add('a');
		list.add("puneeth");
		list.add(-2);
		list.add("nani");
		list.add(s.id);
		list.addFirst(s);
		list.addLast(s);
		
//		System.out.println(list.get(5));
		
		for(Object o: list) {
			System.out.print(o + " ");
		}
		
//		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
//		System.out.println(list1);
		
	}
}
