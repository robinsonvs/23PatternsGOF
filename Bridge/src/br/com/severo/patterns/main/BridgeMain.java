package br.com.severo.patterns.main;

import br.com.severo.patterns.abstracts.Shape;
import br.com.severo.patterns.concrets.Circle;
import br.com.severo.patterns.concrets.GreenCircle;
import br.com.severo.patterns.concrets.RedCircle;

public class BridgeMain {
	public static void main(String[] args) {
		Shape redCircle = new Circle(100,100,10, new RedCircle());
		Shape greenCircle = new Circle(100,100,10, new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
	}
}
