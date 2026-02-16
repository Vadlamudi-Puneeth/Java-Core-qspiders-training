package practise;
import java.util.*;
import java.util.stream.Collectors;

public class Task21 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("nani", "puneeth", "hi", "hello", "bye"));
		List<String> names = list.stream().filter(x -> x.length() > 4).collect(Collectors.toList());
		System.out.println(names);
	}
}
