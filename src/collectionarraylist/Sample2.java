package collectionarraylist;
import java.util.*;

public class Sample2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();		
		
		al.add(1);
		al.add(2);
		al.add(3);
//		System.out.println(al);
		
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("red");
		al1.add("black");
		al1.add("green");
		al1.add("yellow");
		
		for(String s: al1) {
			System.out.println(s);
		}
		
	}
}
