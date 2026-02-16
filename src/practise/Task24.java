package practise;

import java.util.*;
import java.util.stream.*;

public class Task24 {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("apple", "bat", "cat", "banana", "dog");
	
		Map<Integer, List<String>> groupedByLength =
		        list.stream()
		            .collect(Collectors.groupingBy(String::length));
	
		System.out.println(groupedByLength);

	}
}
