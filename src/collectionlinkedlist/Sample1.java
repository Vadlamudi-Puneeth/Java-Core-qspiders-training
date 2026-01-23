package collectionlinkedlist;
import java.util.LinkedList;

public class Sample1 {
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		// inserting the elements into the linked list
		
		ll.add(10);
		ll.add("nani");
		ll.add(20);
		ll.add("nani");
		ll.add(40);
//		ll.add(2, "puneeth");
//		ll.addFirst(-1);
//		ll.addLast(-2);
//		ll.addAll(2, ll)
		
		
		// removing the elements from linked list 
		ll.remove(2);
//		ll.remove((Integer)20);
//		ll.removeAll(ll);
//		ll.removeFirst();
//		ll.removeLast();
//		ll.removeFirstOccurrence((String)"nani");
//		ll.removeLastOccurrence((String)"nani");
		
		//retaining the elements of linked list
//		LinkedList ll1 = new LinkedList();
//		ll1.add(20);
//		ll.retainAll(ll1);
		
		//set
//		ll.set(2, "rifirw");
		
		System.out.println(ll);
		
	}
}
