package br.com.severo.patterns.concrets;

import br.com.severo.patterns.abstracts.Shape;

public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}
	
	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
