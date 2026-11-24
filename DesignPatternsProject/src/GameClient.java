import java.rmi.*;
import java.rmi.registry.*;


public class GameClient {
	public static void main(String[] args) {
		System.out.println("Client has started");
		try {
			Registry r = LocateRegistry.getRegistry("localhost", 1234);

			GameListInterface gl = (GameListInterface) r.lookup("gameListObject");

			GameView view = new GameView();
			GameController controller = new GameController(gl, view);

			controller.showAllGames();
			view.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}