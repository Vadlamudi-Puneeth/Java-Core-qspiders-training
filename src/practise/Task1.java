package practise;
import java.util.*;
import java.util.stream.*;

public class Task1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15, 16));
		
//		List<Integer> evenList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		Stream<Integer> evenList = list.stream().filter(x -> x % 2 == 0);
		// the above is stream object 
		evenList.forEach(
					x -> System.out.println(x)
				);
		
	}
}
