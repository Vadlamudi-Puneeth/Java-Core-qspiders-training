package functionalprogramming;
import java.util.*;
import java.util.function.*;

public class Example3 {
	private String name;
	private int age;
	
	Example3(){
		System.out.println("from no arg constructor");
	}
	
	Example3(String name){
		this.name = name;
		System.out.println(name);
	}
	
	public void display(int s) {
		System.out.print(s + " ");
	}
	
	public static void square(int a) {
		System.out.print((a * a) + " ");
	}
	
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
//		list.forEach(x -> System.out.print(x + " "));
//		
//		System.out.println();
//		list.forEach(a -> square(a));
		
		// method reference
//		list.forEach(Example3 :: square);
		
//		Example3 e3 = new Example3();
//		list.forEach(e3 :: display);
		
		//create an object for no args supplier is inbuilt interface
//		Supplier<Example3> s = Example3 :: new;
//		s.get();
		
		//create an object for parameterized constructor
		Function<String, Example3> f = Example3:: new;
		f.apply("Dinga");
		
		
		
	}
	
}
