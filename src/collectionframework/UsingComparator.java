package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsingComparator {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "puneeth"));
		list.add(new Student(2, "nani"));
		list.add(new Student(3, "mahesh"));
		list.add(new Student(4, "pavan"));
		
		Collections.sort(list,new Comparator<Student>(){
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
		
		System.out.println(list);
		
	}
}
