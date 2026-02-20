package practiseq3;

import java.util.ArrayList;
import java.util.List;

public class Delimiter {
	public static void main(String[] args) {
		String text = "This IS a sample text for delimiter";
		String lower = text.toLowerCase();
		
		int count = 0;
		List<String> list = new ArrayList<>();
		
		int start = 0;
		
		for(int i = 0;i < lower.length(); i++) {
			if(lower.charAt(i) == 'i') {
				count++;
				if(count % 2 == 0) {
					list.add(lower.substring(start, i));
					start = i + 1;
				}
			}
		}
		
		list.add(lower.substring(start));
		
		System.out.println(list);
		
	}
}
