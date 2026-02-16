package collectionframework;

import java.util.Collections;
import java.util.*;

public class UsingComparable {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "puneeth", 20000));
		list.add(new Employee(2, "nani", 3000));
		list.add(new Employee(3, "mahesh", 4000));
		list.add(new Employee(4, "pavan", 5000));
		
		Collections.sort(list);
		System.out.println(list);
		
	}
}
