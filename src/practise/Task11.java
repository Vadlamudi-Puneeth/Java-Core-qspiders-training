package practise;
import java.util.*;
import java.util.stream.*;

public class Task11 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("","a","","wdwefh"));
		List<String> remove = list.stream().filter(x -> !x.isEmpty() && x != null).collect(Collectors.toList());
		System.out.println(remove);
	}
}
