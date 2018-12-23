package br.com.severo.products;

import br.com.severo.interfaces.AbstractProductA;
import br.com.severo.interfaces.AbstractProductB;

public class ProductB1 implements AbstractProductB{

	@Override
	public void interact(AbstractProductA abstractProductA) {
		
		System.out.println(this.getClass().getName() + " interact with " + abstractProductA.getClass().getName());
		
	}

}
