package br.com.severo.patterns.main;

import br.com.severo.patterns.abstracts.AbstractFactory;
import br.com.severo.patterns.interfaces.Color;
import br.com.severo.patterns.interfaces.Shape;
import br.com.severo.patterns.producer.FactoryProducer;

public class AbstractFactoryMain {
	
	public static void main(String[] args) {
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
		
		Color color1 = colorFactory.getColor("RED");
		color1.fill();
		
		Color color2 = colorFactory.getColor("GREEN");
		color2.fill();
		
		Color color3 = colorFactory.getColor("BLUE");
		color3.fill();
	}
}
