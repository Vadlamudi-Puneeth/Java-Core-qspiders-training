package functionalinterfacepredicate;
import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(80);
		list.add(12);
		list.add(23);
		list.add(56);
		list.add(33);
		Collections.sort(list, new MyComparator());
		System.out.println(list);
	}
}
