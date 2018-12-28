package br.com.severo.patterns.concrets;

import java.util.ArrayList;
import java.util.List;

import br.com.severo.patterns.interfaces.Criteria;
import br.com.severo.patterns.model.Person;

public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<>();
		
		for (Person person : persons) {
			if (person.getGender().equalsIgnoreCase("MALE")) {
				malePersons.add(person);
			}
		}
		
		return malePersons;
	}
}
