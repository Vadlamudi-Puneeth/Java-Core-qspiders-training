package onlyfunctionalinterfacepredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentMain {
	public static void main(String[] args) {
		StudentUtil su = new StudentUtil();
		List<Student> students = new ArrayList<>();

        students.add(new Student("Arjun",85,"IT"));
        students.add(new Student("Priya",72,"CS"));
        students.add(new Student("Rahul",91,"IT"));
        students.add(new Student("Sneha",65,"ECE"));
        students.add(new Student("Aditya",88,"CS"));
        
        Predicate<Student> p = i -> i.getDept().equalsIgnoreCase("it");
        System.out.println(su.filterStudents(students, p));
        
        Predicate<Student> p1 = su.marksAbove(84);
        System.out.println(p1.test(new Student("nani", 19, "cs")));

	}
}
