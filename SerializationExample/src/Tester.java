import java.io.*;
import java.util.*;

public class Tester {
	public static void main(String[] args) {
		Staff s1 = new Staff(12345, "John Pork", "Galway", 80000);
		Staff s2 = new Staff(1234567, "Peter Joe", "Cork", 81000);
		try {
		FileOutputStream fo = new FileOutputStream("Staff.ser");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		//oo.writeObject(s1);
		ArrayList<Staff> staffList = new ArrayList();
		staffList.add(s1);
		staffList.add(s2);
		oo.writeObject(staffList);
		oo.close();
		}catch (Exception e) {
			System.out.println("theres a problem");
		}
		try {
			FileInputStream fi = new FileInputStream("Staff.Ser");
			ObjectInputStream oi = new ObjectInputStream(fi);
			ArrayList<Staff> listOfStaff = (ArrayList) oi.readObject();
			for (Staff s : listOfStaff) {
				System.out.println(s.getName());
			}
			//Staff s = (Staff) oi.readObject();
			//Staff ss = (Staff) oi.readObject();
			//System.out.println(s.getName());
			//System.out.println(ss.getName());
			oi.close();
		}catch (Exception e1) {
			System.out.print("theres a problem 2");
		}
		
	}
}
