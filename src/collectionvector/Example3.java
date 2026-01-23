package collectionvector;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Arrays;

public class Example3 {
	public static void main(String[] args) {
//		ArrayList<String> arr = new ArrayList<>(Arrays.asList("1", "2", "3"));
		Vector<String> vc = new Vector<>(); // in this brackets we can pass any collection that will be added in vc
		
		vc.add("Geeks");
		vc.add("Geeks");
		vc.add(1, "for");
		
//		System.out.println(vc);
		
		for(int i = 0;i < vc.size(); i++) {
			System.out.println(vc.get(i)); // this get(int index) method will returns the element
		}
		
	}
}
