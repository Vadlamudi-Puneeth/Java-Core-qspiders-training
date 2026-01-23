package collectionmap;
import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(99, "nani");
		map.put(2, "puneeth");
		map.put(5, "shiva");
		map.put(425, "mahesh");
		map.put(1, "pavan");
		map.put(null, "dskf");
		map.put(null, "bc");
		
//		map.remove(6);
				
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
		
	}
}
