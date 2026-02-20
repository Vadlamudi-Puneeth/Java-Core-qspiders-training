package before1daypractise;

import java.util.*;
import java.util.function.*;

public class OrderProcessor {

    private PriorityQueue<Order> pq =
            new PriorityQueue<>(
                    (a,b)->b.getPriority()-a.getPriority());

    public void addOrder(Order o){
        pq.add(o);
    }

    // TODO 1
    // Predicate: return only PAID orders
    public Predicate<Order> paidOrders(){
        return p -> p.getStatus().equalsIgnoreCase("paid");
    }

    // TODO 2
    // Supplier: generate emergency order
    public Supplier<Order> emergencyOrder(){
        return () -> new Order( 999,"Emergency","Priority",0,"HQ",10,"PAID");
    }

    // TODO 3
    // Function: convert order -> "Customer : Amount"
    public Function<Order,String> summary(){
        return (o) -> o.getCustomer() + " " + o.getAmount();
    }

    // TODO 4
    // Consumer: print order in uppercase
    public Consumer<Order> printUpper(){
        return c -> System.out.println(c.toString().toUpperCase());
    }

    // TODO 5
    // Process queue using Consumer
    public void processQueue(Consumer<Order> c){

        while(!pq.isEmpty()){
            c.accept(pq.poll());
        }
    }
    
    public Order poll(){
        return pq.poll();
    }

}

