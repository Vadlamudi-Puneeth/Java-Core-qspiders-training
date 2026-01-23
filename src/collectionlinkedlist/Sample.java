package collectionlinkedlist;
import java.util.*;

public class Sample {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Employee> ll = new LinkedList<>();
		
		ll.add(new Employee(101, "nani"));
		ll.add(new Employee(102, "puneeth"));
		ll.add(new Employee(103, "pavan"));
		ll.add(new Employee(104, "siva"));
		
		
		int searchId = sc.nextInt();
		
		ListIterator<Employee> li = ll.listIterator();

		while(li.hasNext()) {
		
			Employee e = li.next();
			
			if(e.getId() == searchId) {
				li.remove();
				break;
			}
			
		}
	
		
//		here i am creating again, because before it has finished (li.next())
		
		ListIterator<Employee> li1 = ll.listIterator();
		
		while(li1.hasNext()) {
			Employee e = li1.next();
			System.out.println(e.getId() + " " + e.getName());
		}
		
		
	}

}
