package functionalprogramming;
import java.util.*;

public class Example2 {
	
	public static void main(String[] args) {
		
//		Map<Integer, String> map = new HashMap<>();
//		
//		map.put(101, "Dingiluu");
//		map.put(102, "Tingiluu");
//		map.put(103, "Chengiluu");
//		
//		map.forEach((k, v) -> System.out.println(k + ", " + v) );
		
//		List<Integer> list = new ArrayList<>(Arrays.asList(10, 11, 12, 13));
//		list.add(111);
		
//		list.removeIf((x) -> x % 2 == 0);
		
//		list.replaceAll(x -> (x % 2 == 0) ? (0): (x));
//		System.out.println(list);
		
//		List<String> list = new ArrayList<>(Arrays.asList("nani", "puneeth", "pavan", "mahesh"));
//		list.replaceAll(x -> x.toUpperCase());
		
//		List<String> list = new ArrayList<>(Arrays.asList("python", "Hibernate", "aaan", "mahesh"));
//		list.replaceAll(x -> (x.length() > 4)? (x.substring(0, 3)): (x));
//		list.replaceAll(x -> x.replaceAll("a", "*")); // this will replace the substring in the strings
//		System.out.println(list);
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(101, "nani", 76));
		list.add(new Student(102, "puneeth", 54));
		list.add(new Student(103, "pavan", 99));
		list.add(new Student(104, "naman", 87));
		list.add(new Student(105, "mohan", 66));
		
		list.sort((a,b) -> a.marks - b.marks);
		list.forEach((a) -> System.out.println(a.id + " " + a.name + " " + a.marks));
		
		
	}
	
}
