package before1daypractise;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudent {
	public List<Student> filterStudents(List<Student> student, Predicate<Student> pred){
		return student.stream().filter(pred).toList();
	}

}
