package br.com.severo.patterns.specialized;

import br.com.severo.patterns.abstracts.ColdDrink;

public class Coke extends ColdDrink {

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 30.0f;
	}
}
