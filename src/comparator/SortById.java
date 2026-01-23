package comparator;

import java.util.*;

public class SortById implements Comparator<Trainer>{
	@Override
	public int compare(Trainer t1, Trainer t2) {
		if(t1.id == t2.id) {
			t1.name.compareTo(t2.name);
		}
		return t1.id - t2.id;
	}
}
