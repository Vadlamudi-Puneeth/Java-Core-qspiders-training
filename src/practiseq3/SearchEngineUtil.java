package practiseq3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class SearchEngineUtil {

	public Map<String, SearchEngine> categorySearchEngine(Stream<SearchEngine> searchEngines){
		
		Map<String, SearchEngine> map = new LinkedHashMap<>();
	
		List<SearchEngine> list = searchEngines.toList();
		
		for(SearchEngine se: list) {
			String category = se.getCategory();
			if(!map.containsKey(category)) {
				map.put(category, se);
			}
		}
		return map;
	}

	
	public Stream<SearchEngine> getTopNSearchEnginesByRating(List<SearchEngine> searchEngines, int n){
//		Collections.sort(searchEngines, new SortByRating());
//		
//		List<SearchEngine> list = new ArrayList<>();
//		
//		int j = 0;
//		for(int i = 0;i < searchEngines.size() && j < n; i++) {
//			
//				list.add(searchEngines.get(i));
//				j++;
//			
//		}
//		
//		return list.stream();
		
		return searchEngines.stream().sorted(Comparator.comparing(SearchEngine :: getRating).reversed()).limit(3);
		
	}
	
	public String findTheMostRecentlyCreatedSearchEngine(Stream<SearchEngine> searchEngines) {
		
		List<SearchEngine> list = searchEngines.toList();
		
		SearchEngine latest = list.get(0);
		
		for(SearchEngine se: list) {
			if(se.getDateCreated().isAfter(latest.getDateCreated())) {
				latest = se;
			}
		}
		
		return latest.getEngineName();
		
		
	}
}
