package practise;
import java.util.*;
import java.util.stream.Collectors;

public class Task25 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5, 2, 3));
		Map<Integer, Integer> map = list.stream().collect(Collectors.toMap(e->e, e->Collections.frequency(list, e)));
		System.out.println(map);
	}
}
