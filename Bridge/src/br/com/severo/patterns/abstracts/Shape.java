package br.com.severo.patterns.abstracts;

import br.com.severo.patterns.interfaces.DrawAPI;

public abstract class Shape {
	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPÌ) {
		this.drawAPI = drawAPÌ;
	}
	
	public abstract void draw();
}
