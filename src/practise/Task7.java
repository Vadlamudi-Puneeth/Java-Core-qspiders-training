package practise;
import java.util.*;
import java.util.stream.Collectors;

public class Task7 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15));
		int givenElement = 12;
		
		long count = list.stream().filter(x -> x > givenElement).count();
		System.out.println(count);
		
	}
}
