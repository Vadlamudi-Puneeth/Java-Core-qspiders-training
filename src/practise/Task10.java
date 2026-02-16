package practise;
import java.util.*;
import java.util.stream.*;

public class Task10 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("nani", "puneeth", null,"pavan", null));
		
		List<String> remove = list.stream().filter(x -> x != null).collect(Collectors.toList());
		System.out.println(remove);
	}
}
