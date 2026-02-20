package practiseq3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieUtil {
	public Stream<Movie> getTopRatedMovies(List<Movie> movies, int n){
		
		return movies.stream().sorted(new SortByRating()).limit(n);
	}

	public Map<String, List<Movie>> groupMoviesByGenre(Stream<Movie> movies){
		Map<String, List<Movie>> map = movies.collect(Collectors.groupingBy(
																	m -> m.getGenre()
																	
															));
		return map;
	}
	
	public double getAverageRating(Stream<Movie> movies) {
		return movies.mapToDouble(m -> m.getRating()).average().getAsDouble();
	}


}
