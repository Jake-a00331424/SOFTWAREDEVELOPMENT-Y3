import java.awt.event.*;
import java.rmi.*;
import java.util.ArrayList;


public class GameController implements ActionListener {
	private GameListInterface gameList;
	private GameView view;

	private String title;
	private String genre;
	private int releaseYear;
	private int rating;
	private String completionStatus;
	public GameController(GameListInterface gameList, GameView view) {
		this.gameList = gameList;
		this.view = view;

		view.getAddButton().addActionListener(this);
		view.getDisplayButton().addActionListener(this);
		view.getEditButton().addActionListener(this);
		view.getDeleteButton().addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == view.getAddButton()) {
				addGame();
			} 
			else if (e.getSource() == view.getDisplayButton()) {
				showAllGames();
			} 
			else if (e.getSource() == view.getEditButton()) {
				editGame();
			} 
			else if (e.getSource() == view.getDeleteButton()) {
				deleteGame();
			}
		} catch (Exception ex) {
			view.showMessage("Could not reach the server");
		}
	}
	public void showAllGames() throws RemoteException {
		ArrayList<GameModel> list = gameList.getList();
		String text = "";
		int number = 1;
		for (GameInterface g : list) {
			text = text + number + ") " + g.getTitle() + " | " + g.getGenre() + " | " + g.getRYear()
					+ " | " + g.getRating() + "/10 | " + g.getCStatus() + "\n";
			number++;
		}
		if (list.size() == 0) {
			text = "No games in the library yet";
		}
		view.showGames(text);
	}
	private void addGame() throws RemoteException {
		if (askForGame()) {
			gameList.addToList(title, genre, releaseYear, rating, completionStatus);
			showAllGames();
		}
	}
	private void deleteGame() throws RemoteException {
		int number = askForNumber("Number of the game to delete:");

		if (number == 0) {
			return;
		}

		if (gameList.removeFromList(number - 1)) {
			showAllGames();
		} else {
			view.showMessage("No game with that number");
		}
	}
	private void editGame() throws RemoteException {
		int number = askForNumber("Number of the game to edit:");
		if (number == 0) {
			return;
		}

		if (number < 1 || number > gameList.getList().size()) {
			view.showMessage("No game with that number");
			return;
		}
		if (askForGame()) {
			gameList.editList(number - 1, title, genre, releaseYear, rating, completionStatus);
			showAllGames();
		}
	}
	private boolean askForGame() {

		title = view.askText("Title:");
		if (title == null) {
			return false;
		}
		genre = view.askText("Genre:");
		if (genre == null) {
			return false;
		}
		String yearText = view.askText("Release year:");
		if (yearText == null) {
			return false;
		}
		String ratingText = view.askText("Rating out of 10:");
		if (ratingText == null) {
			return false;
		}
		completionStatus = view.askText("Completion status:");
		if (completionStatus == null) {
			return false;
		}
		try {

			releaseYear = Integer.parseInt(yearText);
			rating = Integer.parseInt(ratingText);
		} catch (Exception e) {

			view.showMessage("Year and rating must be whole numbers");
			return false;
		}
		return true;
	}
	private int askForNumber(String prompt) {
		String text = view.askText(prompt);
		if (text == null) {
			return 0;
		}
		try {
			return Integer.parseInt(text);
		} catch (Exception e) {
			view.showMessage("Please enter a number");
			return 0;
		}
	}
}
