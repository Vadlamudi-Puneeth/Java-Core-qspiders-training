package m1TractFI;

import java.util.*;
import java.util.function.*;

public class TrackUtil {
	
	public static Track parseTrack(String input) throws InvalidTrackException {
		
		String str[] = input.split("//s+");
		
		try {
			
			if(str.length != 7) {
				throw new InvalidTrackException("invalid track");
			}
			
				String trackId = str[0];
				String artist = str[1];
				String title = str[2];
				String genre = str[3];
				double earnings = Double.parseDouble(str[4]);
				int releaseYear = Integer.parseInt(str[5]);
				double rating = Double.parseDouble(str[6]);
				List<String> tag = null;
				
				String listSplit[] = str[7].split(",");
				for(String i: listSplit) {
					tag.add(i);
				}
				return new Track(trackId, artist, title, genre, earnings, releaseYear, rating, tag);
		}catch(NumberFormatException nfe) {
			throw new InvalidTrackException("invalid format");
		}catch (Exception e) {
            throw new InvalidTrackException("Error parsing track data");
        }
		
		
		
	}

	public static Predicate<Track> isReleasedBefore(int year) {
		
		Predicate<Track> pr = (track) -> (year < track.getReleaseYear());
		return pr;
		
	}
	
//	public static Function<Track, Double> genreAdjustMent() {
//		
//	}

}
