package br.com.severo.patterns.concrets;

import java.util.ArrayList;
import java.util.List;

import br.com.severo.patterns.interfaces.Criteria;
import br.com.severo.patterns.model.Person;

public class CriteriaSingle implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<>();
		
		for (Person person : persons) {
			if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
				singlePersons.add(person);
			}
		}
		
		return singlePersons;
	}
}
