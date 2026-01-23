package collectionmap;
import java.util.*;

public class Example2 {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new LinkedHashMap<>(); // here map is reference type and we are creating object and storing it in map variable
		
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
		
		List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
		    @Override
		    public int compare(Map.Entry<Integer, String> e1, Map.Entry<Integer, String> e2) {
		        // handle null keys also
		        if (e1.getKey() == null && e2.getKey() == null) return 0;
		        if (e1.getKey() == null) return -1;
		        if (e2.getKey() == null) return 1;

		        return e1.getKey().compareTo(e2.getKey());
		    }
		});

		
		for (Map.Entry<Integer, String> entry : list) {
		    System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		
		
	}
}
