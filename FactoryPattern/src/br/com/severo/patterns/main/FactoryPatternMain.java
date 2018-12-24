package br.com.severo.patterns.main;

import br.com.severo.patterns.factory.ShapeFactory;
import br.com.severo.patterns.interfaces.Shape;

public class FactoryPatternMain {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		
		Shape shape1 = factory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2 = factory.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3 = factory.getShape("SQUARE");
		shape3.draw();
	}
}
