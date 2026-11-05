
public class GameModel {
	private String title;
	private String genre;
	private int releaseYear;
	private int rating;
	private String completionStatus;

	public GameModel(String title, String genre, int releaseYear, int rating, String completionStatus) {
		this.title = title;
		this.genre = genre;
		this.releaseYear = releaseYear;
		this.rating = rating;
		this.completionStatus = completionStatus;
	}

	public void setTitle(String title) {
		this.title = title;

	}

	public String getTitle() {
		return title;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setRYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getRYear() {
		return releaseYear;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	public void setCStatus(String completionStatus) {
		this.completionStatus = completionStatus;
	}

	public String getCStatus() {
		return completionStatus;
	}
}
