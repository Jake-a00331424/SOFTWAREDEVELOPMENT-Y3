
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameView {
	
	
	public void showGameDetails(String title, String genre, int releaseYear, int rating, String completionStatus) {
		JFrame window = new JFrame("Employee");
		
		JLabel titleLabel = new JLabel(title);
		JLabel genreL = new JLabel(genre);
		JLabel releaseYearLTemp = new JLabel();
		releaseYearLTemp.setText(String.valueOf(releaseYear));
		JLabel ratingLTemp = new JLabel();
		ratingLTemp.setText(String.valueOf(rating));
		JLabel completionStatusL = new JLabel(completionStatus);
		JPanel detailsPanel = new JPanel();
		
		
		detailsPanel.add(titleLabel);
		detailsPanel.add(genreL);
		detailsPanel.add(releaseYearLTemp);
		detailsPanel.add(ratingLTemp);
		detailsPanel.add(completionStatusL);
		
		window.setSize(200,200);
		window.add(detailsPanel);
		window.pack();
		window.setVisible(true);
		
	}
	public void printGameDetails(String title, String genre, int releaseYear, int rating, String completionStatus) {
		System.out.println("GAME LIBRARY ");
		System.out.println("Title: " + title);
		System.out.println("Genre: " + genre);
		System.out.println("Release Year: " + releaseYear);
		System.out.println("Rating: " + rating);
		System.out.println("Completion Status: " + completionStatus);
		
	}
}
