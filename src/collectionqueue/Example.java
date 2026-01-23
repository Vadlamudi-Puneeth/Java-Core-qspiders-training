package collectionqueue;
import java.util.*;

public class Example {
	public static void main(String[] args) {
		
		Queue q = new LinkedList(); // we cannot create obj for queue interface that's y upcasting
		q.add(10);
		q.add(50);
		q.add(20);
		q.offer(15);
		
		System.out.println(q.poll());
		
		System.out.println(q.peek());
		System.out.println(q.element());
		
		System.out.println(q.contains(20));
		
	}
}
