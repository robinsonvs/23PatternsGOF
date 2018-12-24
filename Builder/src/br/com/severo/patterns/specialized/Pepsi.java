package br.com.severo.patterns.specialized;

import br.com.severo.patterns.abstracts.ColdDrink;

public class Pepsi extends ColdDrink {

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 35.0f;
	}
}
