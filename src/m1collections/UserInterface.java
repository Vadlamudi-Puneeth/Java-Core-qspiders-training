package m1collections;
import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of trails");
		int noOfTrails = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Input each trail as 'trailId:name:region:difficulty:hikeCount'");
		
		int count = 0;
		for(int i = 0;i < noOfTrails; i++) {
			System.out.println("Enter trail no: " + (count++));
			String trail_details = sc.nextLine();
			String []split = trail_details.split(":");
			Trail t = new Trail(split[0], split[1], split[2], split[3], Integer.valueOf(split[4]));
			TrailUtil.addTrailRecord(t);
		}
		
		System.out.println("\nEnter the Trail Id to check hike status");
		String trailId = sc.nextLine();
		Trail t = TrailUtil.getTrailById(trailId);
		
		if(t == null) {
			System.out.println("Trail Id " + trailId + " not found");
		}else {			
			System.out.println(t.getTrailId() + " | " + t.getName() + " | " + t.getRegion() + " | " + t.getDifficulty() + " | " + t.getHikeCount());
		}
		
		System.out.println();
		Set<Trail> set = TrailUtil.getMostHikedTrails();
		for(Trail t1: set) {
			System.out.println(t1.getTrailId() + " | " + t1.getName() + " | " + t1.getRegion() + " | " + t1.getDifficulty() + " | " + t1.getHikeCount());
		}
		
		System.out.println();
		Map<String, Integer> map = TrailUtil.getHikeCountByRegion();
		for(Map.Entry<String, Integer> m: map.entrySet()) {
			System.out.println(m.getKey() + ": " + m.getValue());
		}
		
		System.out.println();
		Map<String, List<Trail>> map1 = TrailUtil.groupTrailsByDifficulty();
		for(Map.Entry<String, List<Trail>> m: map1.entrySet()) {
			
			String difficulty = m.getKey();
			System.out.println(difficulty);
			
			List<Trail> list = m.getValue();
			
			for(Trail t2: list) {
				System.out.println(t2.getTrailId() + " | " + t2.getName() + " | " + t2.getRegion() + " | " + t2.getDifficulty() + " | " + t2.getHikeCount());
			}
			
		}
		
		System.out.println("\nEnter the trailId and additional_hikes");
		String trailId1 = sc.nextLine();
		int additionalHikes = sc.nextInt();
		sc.nextLine();
		
		if(TrailUtil.updateHikeCount(trailId1, additionalHikes)) {
			System.out.println("Updated " + trailId1 + " by " + additionalHikes + " hikes");
			Trail updated = TrailUtil.getTrailById(trailId1);
			System.out.println(updated.getTrailId() + " | " + updated.getName() + " | " + updated.getRegion() + " | " + updated.getDifficulty() + " | " + updated.getHikeCount() + " hikes");
		}else {
			System.out.println("ID doesn't exist");
		}
		
		System.out.println("\nFilter trails by region and difficulty");
		String region = sc.nextLine();
		String difficulty = sc.nextLine();
		
		List<Trail> filter = TrailUtil.filterTrails(region, difficulty);
		for(Trail t4: filter) {
			System.out.println(t4.getTrailId() + " | " + t4.getName() + " | " + t4.getRegion() + " | " + t4.getDifficulty() + " | " + t4.getHikeCount());
		}
		
		System.out.println("\nEnter the no of trails");
		int n = sc.nextInt();
		Map<String, List<Trail>> map2 = TrailUtil.getTopTrailsByRegion(n);
		
		for(Map.Entry<String, List<Trail>> map3: map2.entrySet()) {
			String region1 = map3.getKey();
			
			System.out.println(region1);
			List<Trail> ls = map3.getValue();
			
			for(Trail t5: ls) {
				System.out.println(t5.getTrailId() + " | " + t5.getName() + " | " + t5.getRegion() + " | " + t5.getDifficulty() + " | " + t5.getHikeCount());
			}
			
		}
		
		System.out.println("\nDifficulty statistics");
		
		Map<String, String> map4 =  TrailUtil.getDifficultyStats();
		for(Map.Entry<String, String> map5: map4.entrySet()) {
			System.out.println(map5.getKey() + " : " + map5.getValue());
		}
		
	}
}
