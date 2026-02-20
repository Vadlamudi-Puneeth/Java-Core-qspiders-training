package before1daypractise;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionIntStudentUtil {
	public Predicate<Student> topper(int limit){
		return p -> p.getMarks() > limit;
	}
	
	public Function<Student,String> resultSummary(){
		return s -> s.getName() + " " + s.getDepartment() + " " + s.getMarks();
	}
	
	public Consumer<Student> addGraceMarks(int bonus){
		return s -> s.setMarks(s.getMarks() + (double)bonus);
	}
	
	Supplier<Student> defaultStudent(){
		return () -> new Student(999,"Backup","Admin",50);
	}
	
	List<Student> filter(List<Student> list, Predicate<Student> pred){
		return list.stream().filter(pred).toList();
	}

}
