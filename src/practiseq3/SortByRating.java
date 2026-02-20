package practiseq3;

import java.util.Comparator;

public class SortByRating implements Comparator<Movie>{
//	public int compare(SearchEngine se1, SearchEngine se2) {
//		return Double.compare(se2.getRating(), se1.getRating());
//	}
	public int compare(Movie e1, Movie e2) {
		return (int) (e2.getRating() - e1.getRating());
	}
}
