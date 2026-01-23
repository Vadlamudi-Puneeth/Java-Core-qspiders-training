package collectionarraylist;
import java.util.*;

public class Exampe {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		Student s = new Student(1, "nani");
		
		list.add(1);
		list.add("hi");
		list.add(true);
		list.add(s);
		
		ArrayList list1 = new ArrayList();
		list1.add(9);
		list1.add("hfhsb");
		list.addAll(2,list1);
		
//		list.add(1,'a'); // if there is any element is present in that index then it will push that to right side and the element is in this pos
		
		System.out.println(list);
		
	}
}
