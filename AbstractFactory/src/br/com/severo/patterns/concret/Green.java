package br.com.severo.patterns.concret;

import br.com.severo.patterns.interfaces.Color;

public class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}
}
