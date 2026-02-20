package onlystreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class OrderMain {
	public static void main(String[] args) {
		 List<Order> orders = new ArrayList<>();

	        orders.add(new Order(101,"Arjun","Electronics",55000,"Chennai","Paid"));
	        orders.add(new Order(102,"Priya","Clothing",3200,"Bangalore","UnPaid"));
	        orders.add(new Order(103,"Rahul","Groceries",1800,"Hyderabad","UnPaid"));
	        orders.add(new Order(104,"Sneha","Furniture",22000,"Mumbai","Paid"));
	        orders.add(new Order(105,"Vikram","Electronics",76000,"Delhi","Paid"));
	        orders.add(new Order(106,"Arjun","Books",900,"Kochi","UnPaid"));
	        orders.add(new Order(107,"Aditya","Clothing",4500,"Pune","Paid"));
	        orders.add(new Order(108,"Meera","Groceries",2100,"Chennai","Paid"));
	
	
//	        getAllPaidUsers(orders);
//	        totalRevenueFromPaidUsers(orders);
//	        highestValueOrder(orders);
//	        getUniqueCustomerNames(orders);
//	        MoreThan50k(orders);
//	        customersByOrderAmount(orders);
//	        groupOrdersByCategory(orders);
//	        countOrdersBycategory(orders);
//	        totalSalesPerCategory(orders);
//	        maximumOrderPerCategory(orders);
//	        averageOrderValuePerCategory(orders);
	        groupOrdersByCity(orders);
	}

	
	public static void getAllPaidUsers(List<Order> orders) {
		List<String> names = orders.stream()
							.filter(u -> u.getStatus().equalsIgnoreCase("paid"))
							.map(orde -> orde.getCustomerName())
							.collect(Collectors.toList());
		
		System.out.println(names);
		
	}
	
	public static void countTotalOrders(List<Order> orders) {
		System.out.println(orders.size());
	}
	
	public static void totalRevenueFromPaidUsers(List<Order> orders) {
		double total = orders.stream()
						.filter(o -> o.getStatus().equalsIgnoreCase("paid"))
						.mapToDouble(o -> o.getAmount()).sum();
		System.out.println(total);
	}
	
	public static void highestValueOrder(List<Order> orders) {
		OptionalDouble max = orders.stream()
					.mapToDouble(o -> o.getAmount()).max();
		
		System.out.println(max.getAsDouble());
				
	}
	
	public static void LowestValueOrder(List<Order> orders) {
		OptionalDouble min = orders.stream()
					.mapToDouble(o -> o.getAmount()).min();
		
		System.out.println(min.getAsDouble());
				
	}
	
	
	public static void getUniqueCustomerNames(List<Order> orders) {
		Set<String> set = orders.stream()
							.map(o -> o.getCustomerName())
							.collect(Collectors.toCollection(LinkedHashSet::new));
		
//		System.out.println(set);
		List<String> list = new ArrayList<>(set);
		System.out.println(list);
//		System.out.println(Arrays.asList(set));

	}
	
	
	public static void MoreThan50k(List<Order> orders) {
		List<String> list = orders.stream()
							.filter(o -> o.getAmount() > 50000)
							.map(o1->o1.getCustomerName())
							.collect(Collectors.toList());
		
		System.out.println(list);
	}
	
	public static void customersByOrderAmount(List<Order> orders) {
		Collections.sort(orders, new SortByAmount());
		System.out.println(orders);
	}
	
	public static void top3(List<Order> order) {
		Collections.sort(order, new SortByAmount());
		List<Order> list = order.stream().limit(3).collect(Collectors.toList());
		System.out.println(list);
	}
	
	
	public static void groupOrdersByCategory(List<Order> order) {
		Map<String, List<Order>> map = order.stream()
										.collect(Collectors.groupingBy(o -> o.getCategory(), LinkedHashMap::new, Collectors.toList()));
	
	
		for(Map.Entry<String, List<Order>> m: map.entrySet()) {
			System.out.println(m.getKey());
			for(Order o: m.getValue()) {
				System.out.println(o);
			}
		}
		
	}
	
	public static void countOrdersBycategory(List<Order> order) {
		Map<String, Long> map = order.stream()
								.collect(Collectors.groupingBy(or -> or.getCategory(), LinkedHashMap::new, Collectors.counting()));
		
		for(Map.Entry<String, Long> m: map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			
		}
	
	}
	
	public static void totalSalesPerCategory(List<Order> order) {
		Map<String, Double> map = order.stream()
									.collect(Collectors.groupingBy(
												o -> o.getCategory(),
												Collectors.summingDouble(o -> o.getAmount())
											));
		
		for(Map.Entry<String, Double>m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	
	}
	
	public static void maximumOrderPerCategory(List<Order> order) {
		Map<String, Optional<Order>> map = order.stream()
									.collect(Collectors.groupingBy(
												o -> o.getCategory(),
												Collectors.minBy(new SortByAmount())
											));
		
		for(Map.Entry<String, Optional<Order>>m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue().get());
		}
									
	}
	
	public static void averageOrderValuePerCategory(List<Order> order) {
		Map<String, Double> map = order.stream()
											.collect(Collectors.groupingBy(
														o -> o.getCategory(),
														Collectors.averagingDouble(o -> o.getAmount())
													));
		
		for(Map.Entry<String, Double>m: map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
	
	public static void groupOrdersByCity(List<Order> order) {
		Map<String, List<Order>> map = order.stream()
										.collect(Collectors.groupingBy(
													o->o.getCity()
												));
		
		for(Map.Entry<String, List<Order>>m: map.entrySet()) {
			System.out.println(m.getKey());
			for(Order o: m.getValue()) {
				System.out.println(o);
			}
		}
		
	}
	
	public static void highestRevenue(List<Order> order) {
		Double max = order.stream().mapToDouble(o -> o.getAmount()).max().getAsDouble();
		
		for(Order o: order) {
			if(o.getAmount() == max) {
				System.out.println(o.getCity());
			}
		}
		
	}
	
	public static void avgOrderPerCity(List<Order> order) {
		Map<String, Double> map = order.stream()
									.collect(Collectors.groupingBy(
												o -> o.getCity(),
												Collectors.averagingDouble(o -> o.getAmount())
											));
									
		for(Map.Entry<String, Double>m: map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
	}
	
}


class SortByAmount implements Comparator<Order>{
		public int compare(Order o1, Order o2) {
			if(o1.getAmount() == o2.getAmount()) {
				return o1.getCustomerName().compareTo(o2.getCustomerName());
			}else {
				return Double.compare(o2.getAmount(), o1.getAmount());
			}
		}
}
