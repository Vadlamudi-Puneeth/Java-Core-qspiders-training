package collectiontreeset;
import java.util.*;

public class SortByPrice implements Comparator<Biryani>{
	
	public int compare(Biryani b1, Biryani b2) {
		if(b1.price == b2.price) {
			b1.name.compareTo(b2.name);
		}
		return b1.price - b2.price;
	}
}
