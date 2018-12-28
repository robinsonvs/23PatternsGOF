package br.com.severo.patterns.concrets;

import java.util.List;

import br.com.severo.patterns.interfaces.Criteria;
import br.com.severo.patterns.model.Person;

public class AndCriteria implements Criteria {
	private Criteria criteria;
	private Criteria otherCriteria;
	
	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}
}
