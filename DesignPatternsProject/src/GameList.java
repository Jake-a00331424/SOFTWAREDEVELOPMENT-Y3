import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;

public class GameList extends UnicastRemoteObject implements GameListInterface {
	private ArrayList<GameModel> games;
	private Serialization ser; 
	
	public GameList() throws RemoteException{
		ser = new Serialization();
		games = ser.load();
	}
	
	public void addToList(String title, String genre, int releaseYear, int rating, String completionStatus) throws RemoteException {
		games.add(new GameModel (title, genre, releaseYear, rating, completionStatus));
		ser.save(games);
	}
	
	public ArrayList<GameModel> getList(){
		return games;
	}
	
	public boolean removeFromList(int index) {
		if(index < 0 || index >= games.size()) {
			return false;
		}
		games.remove(index);
		ser.save(games);
		return true;
	}
	
	public boolean editList(int index,String title, String genre, int releaseYear, int rating, String completionStatus) {
		if (index < 0 || index >= games.size()) {
			return false;
		}
		GameModel g = games.get(index);
		g.setTitle(title);
		g.setGenre(genre);
		g.setRYear(releaseYear);
		g.setRating(rating);
		g.setCStatus(completionStatus);
		ser.save(games);
		return true;
	}
}
