package onlyfunctionaliinterfacefunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StudentUtil {
	public Function<Student, String> getNameFunction(){
	
		
		return s -> s.getName(); 
		
	}

	public Function<Student, String> gradeFunction(){
		return s -> (s.getMarks() >= 80) ? ("A") : ((s.getMarks() >= 60)?("B"):("C"));
	}
}
