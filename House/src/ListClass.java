
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ListClass extends UnicastRemoteObject implements ListInterface{
	private ArrayList<House> houseList = new ArrayList();
	
	public ListClass() throws RemoteException{
		
	}
	
	public ArrayList<House> getHouses(){
		return houseList;
	}
	public void addToList(House h) {
		houseList.add(h);
	}
}
