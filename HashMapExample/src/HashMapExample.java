import java.util.HashMap;
	
public class HashMapExample {

	private HashMap<String, Person> mapOfPeople = new HashMap();
	
	public HashMapExample()
	{
		mapOfPeople.put("Mary", new Person("Mary", "Dublin", 6769420));
		mapOfPeople.put("John", new Person("John", "Galway", 6749420));
		mapOfPeople.put("Joe", new Person("Joe", "Sligo", 6759420));
	}
	
	public Person returnPerson(String n) 
	{
		return mapOfPeople.get(n);
	}
}
