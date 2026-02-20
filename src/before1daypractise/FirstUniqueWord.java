package before1daypractise;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueWord {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
	
		String input = "hi nani hello nani how are you hello";
		
		String arr[] = input.split("\\s+");
		
		for(int i = 0;i < arr.length; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 0);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		boolean flag = false;
		for(Map.Entry<String, Integer>m : map.entrySet()) {
			if(m.getValue() == 0) {
				System.out.println(m.getKey());
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("NONE");
		}
		
	}
}
