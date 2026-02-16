package practise;
import java.util.*;
import java.util.stream.*;

public class Task20 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		List<Integer> cube = list.stream().map(x -> x * x * x).collect(Collectors.toList());
		System.out.println(cube);
	}
}
