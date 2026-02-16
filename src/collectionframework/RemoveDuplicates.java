package collectionframework;
import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,3,2,56,8,0));
		Set<Integer> set = new LinkedHashSet<>(list);
		List<Integer> list1 = new ArrayList<>(set);
		
		System.out.println(list1);
		
	}
}
