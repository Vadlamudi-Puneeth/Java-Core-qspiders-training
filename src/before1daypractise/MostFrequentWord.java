package before1daypractise;

import java.util.LinkedHashMap;
import java.util.Map;

public class MostFrequentWord {
	public static void main(String[] args) {
		
		String input = "hi nani hello nani how are you nani hello";
		
		Map<String, Integer> map = new LinkedHashMap<>();
	
		String arr[] = input.split("\\s+");
		
		for(int i = 0;i < arr.length; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		int max = map.get(arr[0]);
		String res = arr[0];
		for(Map.Entry<String, Integer>m: map.entrySet()) {
			if(max < m.getValue()) {
				max = m.getValue();
				res = m.getKey();
			}
		}
		
		System.out.println(res);
		
	}
}
	

