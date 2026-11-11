import java.util.Scanner;

public class GameCollectionTester {
	public static void main(String[] args) {
		GameModel model = new GameModel();
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("What would you like to do?");
//		System.out.println("1) Add a game to the colletion");
//		System.out.println("2) View game collection");
//		System.out.println("3) Edit a game in the collection");
//		System.out.println("4) Delelte a game in the collection");
//		int choice = scanner.nextInt();
		
		model.setTitle("Minecraft");
		model.setGenre("Survival/Adventure");
		model.setRYear(2011);
		model.setRating(10);
		model.setCStatus("Completed");
		GameView view = new GameView();
		view.showGameDetails(model.getTitle(), model.getGenre(), model.getRYear(), model.getRating(), model.getCStatus());
		
		GameController controller = new GameController(model, view);
		controller.updateView();
		controller.setGameTitle("The Forest");
		controller.updateView();
		
		controller.showDetails();
	}
}
