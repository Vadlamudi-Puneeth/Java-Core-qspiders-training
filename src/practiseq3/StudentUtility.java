package practiseq3;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentUtility {
	
	public Map<String, List<Student>> groupStudentsByDepartment(Stream<Student> students){
		Map<String, List<Student>> map = students
										.collect(Collectors.groupingBy(s -> s.getDept()));
		
		
		for(Map.Entry<String, List<Student>>m: map.entrySet()) {
			System.out.println(m.getKey());
			for(Student s: m.getValue()) {
				System.out.println(s);
			}
		}
		
		return map;
	}

	public Stream<Student> findTop3Students(List<Student> students){
		
		Collections.sort(students, new SortByMarks());
		
		return students.stream().limit(3);
	}
	
	public double calculateAverageMarks(Stream<Student> students) {
		double marks = students.mapToDouble(s -> s.getMarks()).average().orElse(0);
		return marks;
	}
	
	public static void main(String[] args) {
		
	}
	
}
