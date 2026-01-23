package collectionlinkedlist;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example2 {
	public static void main(String[] args) {
		
		LinkedList<Student> ll = new LinkedList<>();
		
		ll.add(new Student(101, "nani"));
		ll.add(new Student(102, "puneeth"));
		ll.add(new Student(103, "pavan"));
		
//		ListIterator<Student> li = ll.listIterator();
//		
//		while(li.hasNext()) {
//			Student current = li.next();
//			System.out.println(current.getId() + "  " + current.getName());
//		}
//		
		
		ListIterator li = ll.listIterator();
		
		while(li.hasNext()) {
			Student curr = (Student)li.next();
			
			System.out.println(curr.getId() + " " + curr.getName());
		}
		
	}
}
