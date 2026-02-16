package practise;
import java.util.*;
import java.util.stream.*;

public class Task2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(10,11,12,13,14,15,16));
		
		List<Integer> oddList = list.stream().filter(x -> x % 2 == 1).collect(Collectors.toList());
		System.out.println(oddList);
	}
}
