package onlyfunctionalinterfacepredicate;

public class Movie {
	
	private String title;
	private double rating;
	private String genre;
	private int year;
	
	public Movie(String title, double rating, String genre, int year) {
		super();
		this.title = title;
		this.rating = rating;
		this.genre = genre;
		this.year = year;
	}
	
	
	public Movie() {}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public String toString() {
		return "Movie [title=" + title + ", rating=" + rating + ", genre=" + genre + ", year=" + year + "]";
	}
	
	
	
	
}
