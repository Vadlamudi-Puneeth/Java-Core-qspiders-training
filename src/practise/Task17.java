package practise;
import java.util.*;

public class Task17 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 13, 24,6, 23,1));
		int res = list.stream().reduce(1, (a, b) -> a + b);
		System.out.println(res / list.size());
	}
}
