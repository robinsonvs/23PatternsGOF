package br.com.severo.patterns.interfaces;

import java.util.List;

import br.com.severo.patterns.model.Person;

public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
