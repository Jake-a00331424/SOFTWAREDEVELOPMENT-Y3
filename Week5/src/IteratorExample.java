import java.util.*;

public class IteratorExample {
	public static void main(String[] args) {
		ArrayList arli = new ArrayList();

		arli.add("M");
		arli.add("O");
		arli.add("N");
		arli.add("D");
		arli.add("A");
		arli.add("Y");

		ListIterator li = arli.listIterator();

		while (li.hasNext()) {
			Object o = li.next();
			System.out.println("element: " + o);

			li.set(o + "----------");

		}
		ListIterator li2 = arli.listIterator();

		while (li2.hasNext()) {
			Object o = li2.next();
			System.out.println("element: " + o);

		}
	}
}