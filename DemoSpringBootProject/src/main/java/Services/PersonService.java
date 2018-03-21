package Services;

import java.util.Hashtable;
import org.springframework.stereotype.Service;
import Model.Person;

@Service

public class PersonService{
	Hashtable<String, Person> persons = new Hashtable<String, Person>();
	public PersonService() {
		Person P = new Person();
		P.setId("1");
		P.setAge(22);
		P.setFirstName("Pallab");
		P.setLastName("Chakraborty");
		persons.put("1", P);
	}
	public Person getPerson(String id) {
		if (persons.containsKey(id))
			return persons.get(id);
		else
			return null;
	}
	public Hashtable<String, Person> getAll(){
		return persons;
	}
}

