import java.io.*;
import java.util.*;

public class Serialization {
		public void save(ArrayList<GameModel> games) {
			try {
				FileOutputStream fo = new FileOutputStream("Games.ser");
				ObjectOutputStream oo = new ObjectOutputStream(fo);
				oo.writeObject(games);
				oo.close();
			}catch (Exception e) {
				System.out.println("cant save game(s)");
			}
		}
		
		
		public ArrayList<GameModel> load(){
			ArrayList<GameModel> games = new ArrayList<GameModel>();
			try {
				FileInputStream fi = new FileInputStream("Games.ser");
				ObjectInputStream oi = new ObjectInputStream(fi);
				games = (ArrayList) oi.readObject();
				oi.close();
			}catch (Exception e) {
				System.out.println("No games found");
			}
			return games;
		}

}
