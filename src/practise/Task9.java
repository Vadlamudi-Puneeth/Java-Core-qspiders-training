package practise;
import java.util.*;
import java.util.stream.*;

public class Task9 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(10,11,12,-10,-9,44,-23));
		
		boolean positive = list.stream().allMatch(x -> x > 0);
		System.out.println(positive);
		
	}
}
