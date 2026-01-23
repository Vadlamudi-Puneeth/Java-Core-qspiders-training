package comparable;
import java.util.*;

public class Sample1 {
	public static void main(String[] args) {
		
		ArrayList<Employee> arr = new ArrayList<>();
		
		arr.add(new Employee(101, "siva"));
		arr.add(new Employee(102, "puneeth"));
		arr.add(new Employee(103, "nani"));
		
		System.out.println(arr);
		
		Collections.sort(arr);
		
		System.out.println(arr);
		
	}
}
