package practise;
import java.util.*;
import java.util.stream.*;

public class Task13 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(50,24,10,14,26,9));
		List<Integer> descend = list.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
		System.out.println(descend);
	}
}
