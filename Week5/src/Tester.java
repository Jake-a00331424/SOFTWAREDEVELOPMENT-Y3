
public class Tester {
	public static void main(String[] args) {
		ArrayListExample ale = new ArrayListExample();
		
		Person p = ale.returnPerson("Mary");
		System.out.println(p.getAddress());
		Person p2 = ale.returnPerson("tom");
		System.out.println(p2.getAddress());
		Person p3 = ale.returnPerson("John");
		System.out.println(p3.getAddress());
	}

}