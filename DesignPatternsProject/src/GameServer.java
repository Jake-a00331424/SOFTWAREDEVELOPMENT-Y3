import java.rmi.*;
import java.rmi.registry.*;


public class GameServer {
	public static void main(String[] args) throws RemoteException {
		System.out.println("SERVER ON");
		try {
			Registry r = LocateRegistry.createRegistry(1234);
			GameList gl = new GameList();
			r.bind("gameListObject", gl);
			System.out.println("Game created");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
