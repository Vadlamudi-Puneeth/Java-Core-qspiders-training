package practise;
import java.util.*;
import java.util.stream.*;

public class Task12 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 21, 10, 19, 12));
		List<Integer> ascending = list.stream().sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
		System.out.println(ascending);
	}
}
