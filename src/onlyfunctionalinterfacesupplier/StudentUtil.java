package onlyfunctionalinterfacesupplier;

import java.util.function.Supplier;

import collectionarraylist.Student;

public class StudentUtil {
	public Supplier<StudentGenerator> createDefaultStudent(){
		Supplier<StudentGenerator> s = () -> new StudentGenerator("nani", 78, "it");
		return s;
	}
}
