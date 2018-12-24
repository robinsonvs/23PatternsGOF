package br.com.severo.patterns.concret;

import br.com.severo.patterns.interfaces.Shape;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
