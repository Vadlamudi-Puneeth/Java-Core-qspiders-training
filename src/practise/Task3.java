package practise;
import java.util.*;
import java.util.stream.*;

public class Task3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("nani", "puneeth", "hi", "ela unnav"));
		
		List<String> upperCase = list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCase);
	}
}
