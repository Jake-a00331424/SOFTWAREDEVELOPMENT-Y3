
import java.awt.event.*;

public class GameController {
	 private GameModel model;
	 private GameView view;
	 
	 public GameController(GameModel model, GameView view) {
		 this.model = model;
		 this.view = view;
	 }
	 
	 public void setGameTitle(String title) {
		 model.setTitle(title);
	 }
	 public String getGameTitle() {
		 return model.getTitle();
	 }
	 public void setGenre(String genre) {
		 model.setGenre(genre);
	 }
	 public String getGenre() {
		 return model.getGenre();
	 }
	 public void setRYear(int releaseYear) {
		 model.setRYear(releaseYear);
	 }
	 public int setRYear() {
		 return model.getRYear();
	 }
	 public void setRating(int rating) {
		 model.setRating(rating);
	 }
	 public int getRating() {
		 return model.getRating();
	 }
	 public void setCStatus(String completionStatus) {
		 model.setCStatus(completionStatus);
	 }
	 public String getCStatus() {
		 return model.getCStatus();
	 }
	 public void updateView() {
		 view.printGameDetails(model.getTitle(), model.getGenre(), model.getRYear(), model.getRating(), model.getCStatus());
	 }
	 public void showDetails() {
		 view.showGameDetails(model.getTitle(), model.getGenre(), model.getRYear(), model.getRating(), model.getCStatus());
	 }
}