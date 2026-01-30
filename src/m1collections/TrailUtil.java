package m1collections;
import java.util.*;

final public class TrailUtil {
	
	private static List<Trail> trailList = new ArrayList<Trail>();

	public static List<Trail> getTrailList() {
		return trailList;
	}

	public static void setTrailList(List<Trail> list) {
		trailList = list;
	}
	
	public static void addTrailRecord(Trail trail) {
		trailList.add(trail);
	}
	
	public static Trail getTrailById(String trailId) {
		Iterator<Trail> it = trailList.iterator();
		
		while(it.hasNext()) {
			Trail curr = it.next();
			if(curr.getTrailId().equals(trailId)) {
				return curr;
			}
		}
		return null;
	}
	
	public static Set<Trail> getMostHikedTrails() {
		
		Set<Trail> set = new HashSet<>();

		if(trailList.isEmpty()) {
			return set;   
		}
		
		ListIterator<Trail> it = trailList.listIterator();
		
		int max = 0;
		
		while(it.hasNext()) {
			Trail curr = it.next();
			if(curr.getHikeCount() > max) {
				max = curr.hikeCount;
			}
		}
		
		while(it.hasPrevious()) {
			Trail curr = it.previous();
			if(curr.getHikeCount() == max) {
				set.add(curr);
			}
		}
		return set;
	}
	
	public static Map<String, Integer> getHikeCountByRegion() {
		
		Map<String, Integer> map = new HashMap<>();
		
		for(Trail t: trailList) {
			String region = t.getRegion();
			int hikeCount = t.getHikeCount();
			
			if(map.containsKey(region)) {
				int existing = map.get(region);
				map.put(region, existing + hikeCount);
			}else {
				map.put(region, hikeCount);
			}
			
		}
		
		return map;
	}
	
	public static Map<String, List<Trail>> groupTrailsByDifficulty(){
		
		Map<String, List<Trail>> map = new HashMap<>();
		
		for(Trail t : trailList) {
			String difficulty = t.getDifficulty();
			
			if(map.containsKey(difficulty)) {
				map.get(difficulty).add(t);
			}else {
				List<Trail> list = new ArrayList<>();
				list.add(t);
				map.put(difficulty, list);
			}
		}
		
		return map;
		
	}
	
	public static boolean updateHikeCount(String trailId, int additionalHikes) {
		for(Trail t: trailList) {
			if(t.getTrailId().equals(trailId)) {
				int newCount = t.getHikeCount() + additionalHikes;
				t.setHikeCount(newCount);
				return true;
			}
		}
		return false;
	}

	public static List<Trail> filterTrails(String region, String difficulty) {
		List<Trail> list = new ArrayList<>();
		
		for(Trail t: trailList) {
			if(t.getRegion().equals(region) && t.getDifficulty().equals(difficulty)) {
				list.add(t);
			}
		}
		return list;
	}
	
	public static Map<String, List<Trail>> getTopTrailsByRegion(int n){
		Map<String, List<Trail>> grouped = new HashMap<>();
		
		for(Trail t: trailList) {
			
			String region = t.getRegion();
			List<Trail> list = grouped.getOrDefault(region, new ArrayList<>());  // if grouped(map) contains region return its value other wise empty list
			list.add(t);
			grouped.put(region, list);
		}
		
		Map<String, List<Trail>> result = new HashMap<>();
		
		for(Map.Entry<String, List<Trail>> entry: grouped.entrySet()) {
			String region = entry.getKey();
			List<Trail> list = entry.getValue();
			
			list.sort((t1, t2) -> Integer.compare(t2.getHikeCount(), t1.getHikeCount()));
			
			List<Trail> topN = new ArrayList<>();
			for(int i = 0;i < list.size() && i < n; i++) {
				topN.add(list.get(i));
			}
			result.put(region, topN);
			
		}
		return result;
		
	}

	public static Map<String, String> getDifficultyStats(){
		Map<String, Integer> countMap = new HashMap<>();
		Map<String, Integer> totalMap = new HashMap<>();
		
		for(Trail t: trailList) {
			String difficulty = t.getDifficulty();
			int hikes = t.getHikeCount();
			
			countMap.put(difficulty, countMap.getOrDefault(difficulty, 0) + 1);
			totalMap.put(difficulty, totalMap.getOrDefault(difficulty, 0) + hikes);
		}
		
		Map<String, String> result = new TreeMap<>();
		
		for(String difficulty: countMap.keySet()) {
			int count = countMap.get(difficulty);
			int totalHikes = totalMap.get(difficulty);
			int avgHikes = totalHikes / count;
			
			String summary = "count = " + count + ", total Hikes = " + totalHikes + " , Average Hikes = " + avgHikes;
			result.put(difficulty, summary);
		}
		
		
		
		return result;
	}
	
	
	
	
	
	
}
