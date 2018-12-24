package br.com.severo.patterns.specialized;

import br.com.severo.patterns.abstracts.Burger;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 25.0f;
	}
}
