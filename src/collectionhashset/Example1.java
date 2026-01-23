package collectionhashset;
import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		
		HashSet<Teacher> hs = new HashSet<Teacher>();
		
		hs.add(new Teacher(101, "nani", 1500l));
		hs.add(new Teacher(98, "puneeth", 2000l));
		hs.add(new Teacher(100, "siva", 3000l));
		hs.add(new Teacher(105, "pavan", 4000l));
		hs.add(new Teacher(103, "mahesh", 2598l));
		
		ArrayList<Teacher> al = new ArrayList<>(hs);
		
		Collections.sort(al);
		
		for(Teacher t: al) {
			System.out.println(t);
		}
		
	}
}
