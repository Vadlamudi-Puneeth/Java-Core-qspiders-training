package functionalinterfacepredicate;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer>{
	
	@Override
	public int compare(Integer obj1, Integer obj2) {
		return obj1.compareTo(obj2);
	}
	
}
