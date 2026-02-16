package functionalinterfacefunction;

import java.util.function.BiFunction;
import java.util.*;

class Employee{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
}

public class BiFunctionExample {
	public static void main(String[] args) {
		BiFunction<Integer, String, Employee> bi = (a, b) -> {
			return new Employee(a, b);
		};
		
		List<Employee> list = new ArrayList<>();
		list.add(bi.apply(101, "nani"));
		list.add(bi.apply(102, "puneeth"));
		list.add(bi.apply(103, "pavAN"));
		list.add(bi.apply(104, "mahesh"));
		
		for(Employee e: list) {
			System.out.println(e.id + " " + e.name);
		}
		
	}
}
