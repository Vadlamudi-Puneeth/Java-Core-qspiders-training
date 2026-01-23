package collectiontreeset;
import java.util.*;

public class SortById implements Comparator<Biryani>{
	
	@Override
	public int compare(Biryani b1, Biryani b2) {
		return b1.id-b2.id;
	}
}
