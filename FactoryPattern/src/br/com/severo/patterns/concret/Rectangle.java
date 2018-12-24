package br.com.severo.patterns.concret;

import br.com.severo.patterns.interfaces.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
