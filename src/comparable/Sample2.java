package comparable;
import java.util.*;

public class Sample2{

	
	public static void main(String[] args) {
		
		ArrayList<Chocolate> arr = new ArrayList<>();
		
		arr.add(new Chocolate(101, "5-star", 10));
		arr.add(new Chocolate(110, "diary milk", 20));
		arr.add(new Chocolate(108, "munch", 30));
		arr.add(new Chocolate(103, "perk", 40));
		arr.add(new Chocolate(102, "kit kat", 50));
		
		System.out.println(arr);
		
		Collections.sort(arr);
		
		for(Chocolate c: arr) {
			System.out.println(c);
		}
//		
		
		
		
//		ArrayList a1 = new ArrayList();
//		a1.add(50);
//		a1.add(80);
//		a1.add(30);
//		Collections.sort(a1);
//		System.out.println(a1);
		
		
	}
}
