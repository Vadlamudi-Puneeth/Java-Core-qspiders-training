package practise;
import java.util.*;

public class Task22 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,6));
		int secondHighest = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
		System.out.println(secondHighest);
	}
}
