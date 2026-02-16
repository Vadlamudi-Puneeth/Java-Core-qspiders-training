package practise;
import java.util.*;
import java.util.stream.*;

public class Task5 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("nani", "ela vunnav", "anta okna", "bye", "aa"));
		
		Optional<String> result = list.stream().filter(x -> x.startsWith("a")).findFirst();
		System.out.println(result.orElse("No match"));
		
		
	}
}
