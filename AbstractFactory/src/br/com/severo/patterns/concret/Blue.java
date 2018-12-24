package br.com.severo.patterns.concret;

import br.com.severo.patterns.interfaces.Color;

public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}
}
