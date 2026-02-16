package m1TractFI;

import java.util.List;

public class Track {
	
	private String trackId;
	private String artist;
	private String title;
	private String genre;
	private double earnings;
	private int releaseYear;
	private double rating;
	private List<String>tag;
	
	public Track() {}
	
	public Track(String trackId, String artist, String title, String genre, double earnings, int releaseYear,
			double rating, List<String> tag) {
		super();
		this.trackId = trackId;
		this.artist = artist;
		this.title = title;
		this.genre = genre;
		this.earnings = earnings;
		this.releaseYear = releaseYear;
		this.rating = rating;
		this.tag = tag;
	}
	
	public String getTrackId() {
		return trackId;
	}
	
	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
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
	
	public double getEarnings() {
		return earnings;
	}
	
	public void setEarnings(double earnings) {
		this.earnings = earnings;
	}
	
	public int getReleaseYear() {
		return releaseYear;
	}
	
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	public double getRating() {
		return rating;
	}
	
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public List<String> getTag() {
		return tag;
	}
	
	public void setTag(List<String> tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "Track [trackId=" + trackId + ", artist=" + artist + ", title=" + title + ", genre=" + genre
				+ ", earnings=" + earnings + ", releaseYear=" + releaseYear + ", rating=" + rating + ", tag=" + tag
				+ "]";
	}
	
	
}
