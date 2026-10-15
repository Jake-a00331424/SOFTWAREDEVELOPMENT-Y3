

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
	public static void main(String[] args) throws RemoteException {
		House h1 = new House("Burkes", "Galway");
		House h2 = new House("Smiths", "Dublin");

		Registry r = LocateRegistry.createRegistry(1345);
		try {
//			r.bind("house1", h1);
//			r.bind("house2", h2);
			ListClass lc = new ListClass();
			lc.addToList(h1);
			lc.addToList(h2);
			
			r.bind("listObject", lc);
			System.out.println("yep that worked.");
		}catch(Exception e) {
			System.out.println("oops");
		}
	}
}

