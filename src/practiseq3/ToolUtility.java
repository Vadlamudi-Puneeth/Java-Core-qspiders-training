package practiseq3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToolUtility {
	
	public Map<String, List<Tool>> retrieveToolsGroupedByCategory(Stream<Tool> tools){
		List<Tool> toolList = tools.toList();
		Map<String, List<Tool>> map = new LinkedHashMap<>();
		
		for(Tool t: toolList) {
			String category = t.getCategory();
			if(map.containsKey(category)) {
				map.get(category).add(t);
			}else {
				map.put(category, new ArrayList<>());
			}
		}
		
		return map;
		
	}	
	
	public Map<String, Double> getManufacturersAndPricesByToolName(Stream<Tool> tools, String toolName){
		
		List<Tool> toolList = tools.toList();
		Map<String, Double> map = new LinkedHashMap<>();
		
		for(Tool t: toolList) {
			
			if(t.getName().equals(toolName)) {
				String manufacture = t.getManufacturer();
				double prices = t.getPrice();
				map.put(manufacture, prices);
			}
		}
		
		return map;
		
	}
	
	public Stream<String> generateSummaryReport(List<Tool> tools){
		int totalTools = tools.size();
		 double totalPrice = 0;
		    int totalQuantity = 0;
//
//		    // normal loop to calculate totals
		    for (Tool t : tools) {
		        totalPrice += t.getPrice();
		        totalQuantity += t.getQuantity();
		    }
//
//		    // create summary strings
		    String s1 = "Total tools: " + totalTools;
		    String s2 = "Total price: " + totalPrice;
		    String s3 = "Total quantity: " + totalQuantity;
//
		    return Stream.of(s1, s2, s3);
//		return tools.stream().collect(Collectors.groupingBy(e -> e.get))
	}
	
}
