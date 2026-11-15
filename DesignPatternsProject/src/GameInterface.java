
import java.rmi.*;

public interface GameInterface extends Remote {
	public String getTitle() throws RemoteException;
	public String getGenre() throws RemoteException;
	public int getRYear() throws RemoteException;
	public int getRating() throws RemoteException;
	public String getCStatus() throws RemoteException;
}
