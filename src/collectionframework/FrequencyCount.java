package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
	public static void main(String[] args) {
		String str = "programming";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(Character c: str.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
	}
}
