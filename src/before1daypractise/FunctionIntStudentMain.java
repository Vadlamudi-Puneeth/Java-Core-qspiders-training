package before1daypractise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionIntStudentMain {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();

		list.add(new Student(101,"Arjun","IT",82));
		list.add(new Student(102,"Priya","HR",67));
		list.add(new Student(103,"Rahul","IT",91));
		list.add(new Student(104,"Meera","Finance",75));
		list.add(new Student(105,"Nani","IT",96));
		list.add(new Student(106,"Kiran","Admin",54));
		
		FunctionIntStudentUtil fis = new FunctionIntStudentUtil();
		list.add(fis.defaultStudent().get());
		
		System.out.println("pred");
		Predicate<Student> pred = fis.topper(75);
		for(Student s: list) {
			if(pred.test(s)) {
				System.out.println(s);
			}
		}
		
		System.out.println("fn");
		Function<Student,String>fn = fis.resultSummary();
		for(Student s: list) {
			System.out.println(fn.apply(s));
		}
		
		System.out.println("consumer");
		Consumer<Student> cm = fis.addGraceMarks(4);
		for(Student s: list) {
			cm.accept(s);
			System.out.println(s);
		}
		
	}
}
