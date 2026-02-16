package practise;
import java.util.*;
import java.util.stream.Stream;

public class Task16 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 11, 12, 13, 19));
		int res = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(res);
	}
}
