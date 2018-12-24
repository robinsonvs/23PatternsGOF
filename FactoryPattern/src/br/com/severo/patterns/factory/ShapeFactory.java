package br.com.severo.patterns.factory;

import br.com.severo.patterns.concret.Circle;
import br.com.severo.patterns.concret.Rectangle;
import br.com.severo.patterns.concret.Square;
import br.com.severo.patterns.interfaces.Shape;

public class ShapeFactory {
	
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
			
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
			
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}
}
