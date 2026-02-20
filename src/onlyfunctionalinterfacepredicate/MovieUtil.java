package onlyfunctionalinterfacepredicate;

import java.util.List;
import java.util.function.Predicate;

public class MovieUtil {
	
	public List<Movie> filterMovies(List<Movie> movies, Predicate<Movie> predicate){
		return movies.stream().filter(p -> predicate.test(p)).toList();
	}
	
	public Predicate<Movie> releasedAfter(int year){
		Predicate<Movie> p = i -> i.getYear() > year;
		return p;
	}
	
	
	public Predicate<Student> combine(Predicate<Student> p1, Predicate<Student> p2){
	    return p1.and(p2);
	}

	
}
