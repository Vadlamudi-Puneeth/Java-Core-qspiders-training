package practise;
import java.util.*;
import java.util.stream.Collectors;

public class Task19 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Integer> squares = list.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(squares);
		
	}
}
