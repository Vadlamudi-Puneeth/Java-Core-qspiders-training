package practiseq3;

import java.util.Comparator;

public class SortByMarks implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		return s2.getMarks() - s1.getMarks();
	}
}
