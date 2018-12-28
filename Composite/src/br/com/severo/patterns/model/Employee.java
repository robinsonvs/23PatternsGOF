package br.com.severo.patterns.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private String dept;
	private double salary;
	private List<Employee> subordinates;
	
	public Employee(String name, String dept, double salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.subordinates = new ArrayList<>();
	}
	
	public void add(Employee employee) {
		this.subordinates.add(employee);
	}
	
	public void remove(Employee employee) {
		this.subordinates.remove(employee);
	}
	
	public List<Employee> getSubordinates() {
		return this.subordinates;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
}
