package practise;
import java.util.*;
import java.util.stream.Collectors;

public class Task23 {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6);

		Set<Integer> duplicates = list.stream()
		        .filter(e -> Collections.frequency(list, e) > 1)
		        .collect(Collectors.toSet());

		System.out.println(duplicates);

	}
}
