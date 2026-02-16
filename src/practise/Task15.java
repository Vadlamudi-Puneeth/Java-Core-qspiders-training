package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task15 {
	public static void main(String[] args) {
List<Integer> list = new ArrayList<>(Arrays.asList(10,12,15,9,4,3));
		
		Optional<Integer> op = list.stream().sorted((a, b) -> a.compareTo(b)).findFirst();
		System.out.println(op.orElse(-1));
	}
}
