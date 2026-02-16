package practise;
import java.util.*;

public class Task18 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 9));
		int product = list.stream().reduce(1, (a, b) -> a * b);
		System.out.println(product);
	}
}
