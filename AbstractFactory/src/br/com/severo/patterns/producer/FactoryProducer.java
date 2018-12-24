package br.com.severo.patterns.producer;

import br.com.severo.patterns.abstracts.AbstractFactory;
import br.com.severo.patterns.factory.ColorFactory;
import br.com.severo.patterns.factory.ShapeFactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
			
		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		
		return null;
	}
}
