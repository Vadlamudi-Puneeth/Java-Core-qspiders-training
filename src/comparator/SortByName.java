package comparator;
import java.util.*;

public class SortByName implements Comparator<Trainer>{
	@Override
	public int compare(Trainer t1, Trainer t2) {
		return t1.name.compareTo(t2.name);
	}
}
