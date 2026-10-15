

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

public class Client {

	public static void main(String[] args) throws RemoteException {
		Registry r = LocateRegistry.getRegistry("localhost", 1345);
		try {
//			HouseInterface newHouse2 = (HouseInterface) r.lookup("house2");
//			HouseInterface newHouse1 = (HouseInterface) r.lookup("house1");
//			System.out.println(newHouse1.getOwners() + newHouse1.getAddress());
//			System.out.println(newHouse2.getOwners() + newHouse2.getAddress());
			
			ListInterface li = (ListInterface) r.lookup("listObject");
			ArrayList<House> lh = li.getHouses();
			for(HouseInterface h : lh) {
				System.out.println(h.getOwners() + " " + h.getAddress());
			}
			
		} catch (Exception e1) {
			System.out.println("nope got a problem");
		}
	}

}
