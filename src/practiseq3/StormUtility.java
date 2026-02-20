package practiseq3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StormUtility {
	
	public double calculateTotalRainfall(Stream<Storm> storms) {
		
		List<Storm> list = storms.toList();
		double total = 0;
		
		for(Storm s: list) {
			total += s.getRainfall();
		}
		
		return total;
		
	}


	public Stream<Storm> findMostIntenseStorm(List<Storm> storms){
		
		double max = 0.0;
		
		for(Storm s: storms) {
			double windspeed = s.getWindSpeed();
			if(windspeed > max) {
				max = windspeed;
			}
		}
		
		List<Storm> list = new ArrayList<>();
		for(Storm s: storms) {
			double windspeed = s.getWindSpeed();
			if(windspeed == max) {
				list.add(s);
			}
		}
		
		return list.stream();
	}
	
	
	
}

