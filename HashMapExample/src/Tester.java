
public class Tester {
	public static void main(String[] args) {
		HashMapExample hme = new HashMapExample();
		Person p = hme.returnPerson("Joe");
		System.out.println(p.getAddress());
	}
}
