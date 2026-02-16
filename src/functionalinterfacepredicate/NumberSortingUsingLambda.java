package functionalinterfacepredicate;
import java.util.*;
import java.util.stream.Collectors;

public class NumberSortingUsingLambda {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(90,10,40,39,20,69,2));
		
		Comparator<Integer> comm = (obj1, obj2) -> (obj1.compareTo(obj2));
		
		Collections.sort(list, comm);
		System.out.println(list);
		
		
		List<Integer> eveList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(eveList);
		
		
		
	}
}
