package br.com.severo.patterns.concrets;

import br.com.severo.patterns.abstracts.Shape;

public class Square extends Shape {

	public Square() {
		type = "Square";
	}
	
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
