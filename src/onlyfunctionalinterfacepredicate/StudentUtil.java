package onlyfunctionalinterfacepredicate;

import java.util.List;
import java.util.function.Predicate;

public class StudentUtil {
	
	public List<Student> filterStudents(List<Student> students, Predicate<Student> condition){
		return students.stream()
				.filter(s -> condition.test(s))
				.toList();
	}
	
	public Predicate<Student> marksAbove(int limit){
		Predicate<Student> p = i -> i.getMarks() > limit;
		return p;
	}
	
	public Predicate<Student> combine(Predicate<Student> p1, Predicate<Student> p2){
		return p1.and(p2);
	}
	
}
