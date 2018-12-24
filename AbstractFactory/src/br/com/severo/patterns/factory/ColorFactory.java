package br.com.severo.patterns.factory;

import br.com.severo.patterns.abstracts.AbstractFactory;
import br.com.severo.patterns.concret.Blue;
import br.com.severo.patterns.concret.Green;
import br.com.severo.patterns.concret.Red;
import br.com.severo.patterns.interfaces.Color;
import br.com.severo.patterns.interfaces.Shape;

public class ColorFactory extends AbstractFactory{

	@Override
	public Color getColor(String color) {
		if (color == null) {
			return null;
		}
		
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		}
		
		if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		}
		
		if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		return null;
	}
}
