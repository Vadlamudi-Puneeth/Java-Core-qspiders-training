package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Task6 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("nani", "ela vunnav", "anta okna", "byz", "aa"));
		Optional<String> res = list.stream().filter(x -> x.endsWith("z")).findAny();
		System.out.println(res.orElse("no match"));
	}
}
