package br.com.severo.patterns.concret;

import br.com.severo.patterns.interfaces.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}
}
