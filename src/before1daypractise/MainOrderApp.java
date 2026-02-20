package before1daypractise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainOrderApp {
	public static void main(String[] args){

	    OrderProcessor p = new OrderProcessor();

	    p.addOrder(new Order(1,"Arjun","Electronics",70000,"Chennai",8,"PAID"));
	    p.addOrder(new Order(2,"Priya","Clothing",5000,"Delhi",3,"PENDING"));
	    p.addOrder(new Order(3,"Meera","Furniture",45000,"Mumbai",9,"PAID"));

	    // ✅ Add emergency order using supplier
	    Order emergency = p.emergencyOrder().get();
	    p.addOrder(emergency);

	    // ✅ Filter only paid orders (example usage)
	    Predicate<Order> paid = p.paidOrders();

	    // ✅ Consumer for uppercase print
	    Consumer<Order> printer = p.printUpper();

	    // ✅ Function for summary
	    Function<Order,String> summary = p.summary();

	    // Example: show summaries of PAID orders
	    System.out.println("PAID ORDER SUMMARIES:");
	    List<Order> temp = new ArrayList<>();

	    // move queue content to temp so we can filter + print
	    while(true){
	        Order o = p.poll();   // if you have poll() method OR use internal list
	        if(o==null) break;
	        temp.add(o);
	    }

	    temp.stream()
	        .filter(paid)
	        .map(summary)
	        .forEach(System.out::println);

	    // re-add to queue
	    temp.forEach(p::addOrder);

	    // ✅ Process priority queue using consumer
	    System.out.println("\nPROCESSING QUEUE:");
	    p.processQueue(printer);
	}

}

