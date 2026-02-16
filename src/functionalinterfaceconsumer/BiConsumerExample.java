package functionalinterfaceconsumer;

import java.util.*;
import java.util.function.BiConsumer;

class Employee1{
	String name;
	double salary;
	public Employee1(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
}

public class BiConsumerExample {
	public static void main(String[] args) {
		BiConsumer<Employee1, Double> bi = (c, s) -> {
			c.salary += s;
		};
		
		List<Employee1> list = new ArrayList<>();
		list.add(new Employee1("nani", 1000));
		list.add(new Employee1("puneeth", 2000));
		list.add(new Employee1("mahesh", 3000));
		list.add(new Employee1("nikhil", 4000));
		
		for(Employee1 e: list) {
			bi.accept(e, 100.1);
		}
		
		for(Employee1 e: list) {
			System.out.println(e.salary);
		}
		
	}
}
