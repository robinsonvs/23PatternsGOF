package br.com.severo.patterns.main;

import br.com.severo.patterns.abstracts.Shape;
import br.com.severo.patterns.cache.ShapeCache;

public class PrototypeMain {
	
	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape1.getType());
		
		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());
		
		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());
	}
}
