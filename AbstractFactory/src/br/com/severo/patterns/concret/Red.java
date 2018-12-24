package br.com.severo.patterns.concret;

import br.com.severo.patterns.interfaces.Color;

public class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}
}
