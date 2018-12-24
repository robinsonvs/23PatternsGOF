package br.com.severo.patterns.abstracts;

import br.com.severo.patterns.concret.Bottle;
import br.com.severo.patterns.interfaces.Item;
import br.com.severo.patterns.interfaces.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
