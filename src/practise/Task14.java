package practise;
import java.util.*;

public class Task14 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(10,12,15,9,4,3));
		
		Optional<Integer> op = list.stream().sorted((a, b) -> b.compareTo(a)).findFirst();
		System.out.println(op.orElse(-1));
	}
}
