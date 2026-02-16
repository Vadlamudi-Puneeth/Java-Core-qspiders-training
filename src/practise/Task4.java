package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("NANI", "PUNEETH", "HI", "ELA UNNAV"));
		
		List<String> lowerCase = list.stream().map(x -> x.toLowerCase()).collect(Collectors.toList());
		System.out.println(lowerCase);
	}
}
