package collectionvector;
import java.util.*;

public class Sample1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vector<Customer> vc = new Vector<>();
		
		vc.add(new Customer(101, "nani", 123454567l));
		vc.add(new Customer(102, "puneeth", 9876545432l));
		vc.add(new Customer(103, "siva", 34646329328l));
		vc.add(new Customer(104, "pavan", 953464267328l));
		vc.add(new Customer(105, "mahesh", 484894283l));
		
		ListIterator<Customer> li = vc.listIterator();
		
		String name = sc.nextLine().trim();
		
		while(li.hasNext()) {
			Customer c = li.next();
			if(c.getName().equalsIgnoreCase(name)) {
				System.out.println(c.getId() + " " + c.getName() + " " + c.getNo() +"\n");
			}
		}
		
		int cid = sc.nextInt();
		
		while(li.hasPrevious()) {
			Customer c = li.previous();
			if(c.getId() == cid) {
				System.out.println("Id with " + cid + " is removing from customer\n");
				li.remove();
			}
		}
		
		while(li.hasNext()) {
			Customer c = li.next();
			System.out.println(c.getId() + " " + c.getName() + " " + c.getNo());
		}
		
		
	}
}
