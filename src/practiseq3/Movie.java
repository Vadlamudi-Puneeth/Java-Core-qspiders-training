package practiseq3;

public class Movie {
	
	String title;
	String genre;
	double rating;
	int year;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Movie(String title, String genre, double rating, int year) {
		super();
		this.title = title;
		this.genre = genre;
		this.rating = rating;
		this.year = year;
	}
	
	
	
	public Movie() {}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", genre=" + genre + ", rating=" + rating + ", year=" + year + "]";
	}
	
	
	
	
	
}
