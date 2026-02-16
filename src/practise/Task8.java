package practise;
import java.util.*;
import java.util.stream.*;

public class Task8 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(5,10,20,34,23,25,13));
		
		boolean res = list.stream().anyMatch(x -> x % 5 == 0);
		System.out.println(res);
		
	}
}
