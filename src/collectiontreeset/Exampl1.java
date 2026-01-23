package collectiontreeset;
import java.util.*;

public class Exampl1 {
	public static void main(String[] args) {
		
		TreeSet<Biryani> ts = new TreeSet<>(new SortById());
		
		ts.add(new Biryani(102, "Mutton", 3400));
		ts.add(new Biryani(101, "Dum", 3000));
		ts.add(new Biryani(100, "Fry", 4090));
		ts.add(new Biryani(100, "aspecial", 4000));
		ts.add(new Biryani(99, "roasted", 4000));
		
		ArrayList<Biryani> al = new ArrayList<>(ts);
		Collections.sort(al, new SortByPrice());
		
		for(Biryani b: al) {
			System.out.println(b);
		}
		
	}
}
