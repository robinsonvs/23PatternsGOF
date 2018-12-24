package br.com.severo.patterns.abstracts;

import br.com.severo.patterns.concret.Wrapper;
import br.com.severo.patterns.interfaces.Item;
import br.com.severo.patterns.interfaces.Packing;

public abstract class Burger implements Item {
	
	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}
