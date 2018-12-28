package br.com.severo.patterns.abstracts;

import br.com.severo.patterns.interfaces.DrawAPI;

public abstract class Shape {
	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAP�) {
		this.drawAPI = drawAP�;
	}
	
	public abstract void draw();
}
