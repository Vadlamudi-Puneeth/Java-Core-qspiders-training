package functionalprogramming;
import java.util.*;

public class Example4 {
	public static void main(String[] args) {
//		int arr[] = {10, 11, 12, 13};
//		
//		Arrays.stream(arr).filter(x -> x % 2 == 0)
//			  .forEach(System.out::println);
		
//		List<Integer> list = new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15));
//		list.stream()
//			.filter(x -> (x % 3 == 0 && x % 5 == 0))
//			.forEach(System.out::println);
		
//		List<Integer> list = new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15));
//		list.stream()
//			.map(x -> ((x % 2 != 0) ? (x * x) : (x))) // filter must return boolean
//			.forEach(System.out::println);
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList("nani","puneeth","Aa","apple"));
		
//		list.stream()
//			.filter(x -> Character.toLowerCase(x.charAt(0)) == 'a')
//			.forEach(System.out::println);
//		
//		list.stream()
//			.map(x -> x.toUpperCase())
//			.forEach(System.out::println);
		
		list.stream()
			.map(x -> x.toLowerCase())
			.forEach(x -> System.out.print(x + " "));
		
//		list.stream()
//			.filter(x -> x.length() > 3)
//			.forEach(System.out::println);
//		
//		System.out.println();
//		System.out.println();
//		System.out.println(list);
		
	}
}
