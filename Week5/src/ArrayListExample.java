import java.util.ArrayList;

public class ArrayListExample {
	private ArrayList<Person> listOfPeople = new ArrayList();

	public ArrayListExample() {
		listOfPeople.add(new Person("Mary", "Galway", 434345677));
		listOfPeople.add(new Person("John", "Dublin", 476767677));
		listOfPeople.add(new Person("tom", "Cork", 4523019));

	}
	public Person returnPerson(String n) {
		for(Person p : listOfPeople)
		{
			if(p.getName().equals(n)) {
				return p;
			}
			
		}
		return null;
	}
}
