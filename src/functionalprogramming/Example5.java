package functionalprogramming;
import java.util.*;

public class Example5 {
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<>();
		
		al.add(new Employee(101, "nani", 25789));
		al.add(new Employee(102, "puneeth", 15789));
		al.add(new Employee(103, "siva", 23529));
		al.add(new Employee(104, "pavan", 12789));
		al.add(new Employee(105, "nikhil", 26989));
		
		al.stream()
		  .filter(x -> x.getSalary() > 25000)
		  .forEach(x -> System.out.println(x.getEname()));
		
	}
}
