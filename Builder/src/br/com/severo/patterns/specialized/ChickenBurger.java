package br.com.severo.patterns.specialized;

import br.com.severo.patterns.abstracts.Burger;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 50.5f;
	}
}
