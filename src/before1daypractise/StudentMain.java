package before1daypractise;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {
	private static final int String = 0;

	public static void main(String[] args) {
/*		1️⃣ Increase marks by 5% for CS students only
		2️⃣ Print the topper student
		3️⃣ Print average marks per department
		4️⃣ Print students sorted by marks descending*/
		
		
		List<Student> students = List.of(
		        new Student(1, "Ravi", "CS", 82),
		        new Student(2, "Anjali", "IT", 75),
		        new Student(3, "Kiran", "CS", 91),
		        new Student(4, "Meena", "ECE", 68),
		        new Student(5, "Arjun", "IT", 88),
		        new Student(6, "Sneha", "CS", 95),
		        new Student(7, "Rahul", "ECE", 72),
		        new Student(8, "Pooja", "CS", 79)
		);
		
		
		List<Student> increse = students.stream().map(
															s -> {
																s.setMarks(s.getMarks() + s.getMarks() * 0.1);
																return s;
															}
														).collect(Collectors.toList());
		
//		System.out.println(increse);
		
		Student topper = students.stream().max(Comparator.comparing(Student::getMarks)).get();
		Double topper1 = students.stream().mapToDouble(e -> e.getMarks()).max().getAsDouble();
//		System.out.println(topper);
		
		Map<String, Double> map = students.stream()
									.collect(Collectors.groupingBy(
												e -> e.getDepartment(),
												Collectors.averagingDouble(e -> e.getMarks())
											));
		
//		System.out.println(map);
		
		students.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).forEach(System.out::println);

		
	}
}
