package br.com.severo.patterns.main;

import java.util.ArrayList;
import java.util.List;

import br.com.severo.patterns.concrets.AndCriteria;
import br.com.severo.patterns.concrets.CriteriaFemale;
import br.com.severo.patterns.concrets.CriteriaMale;
import br.com.severo.patterns.concrets.CriteriaSingle;
import br.com.severo.patterns.concrets.OrCriteria;
import br.com.severo.patterns.interfaces.Criteria;
import br.com.severo.patterns.model.Person;

public class FilterMain {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("Robert", "Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));
		
		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();
		Criteria singleMale = new AndCriteria(single, male);
		Criteria singleOrFemale = new OrCriteria(single, female);
		
		System.out.println("Males: ");
		printPersons(male.meetCriteria(persons));
		
		System.out.println("\nFemales: ");
		printPersons(female.meetCriteria(persons));
		
		System.out.println("\nSingle Males: ");
		printPersons(singleMale.meetCriteria(persons));
		
		System.out.println("\nSingle or Females: ");
		printPersons(singleOrFemale.meetCriteria(persons));
		
	}
	
	public static void printPersons(List<Person> persons) {
		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName() + 
										", Gender : " + person.getGender() + 
										", Marital Status : " + person.getMaritalStatus());
		}
	}
}
