
import java.rmi.*;
import java.util.ArrayList;

public interface GameListInterface extends Remote {
	public void addToList(String title, String genre, int releaseYear, int rating, String completionStatus) throws RemoteException;
	public ArrayList<GameModel> getList() throws RemoteException;
	public boolean removeFromList(int index) throws RemoteException;
	public boolean editList(int index, String title, String genre, int releaseYear, int rating, String completionStatus) throws RemoteException;
}
