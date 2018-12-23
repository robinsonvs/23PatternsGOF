package br.com.severo.factory;

import br.com.severo.interfaces.AbstractFactory;
import br.com.severo.interfaces.AbstractProductA;
import br.com.severo.interfaces.AbstractProductB;
import br.com.severo.products.ProductA2;
import br.com.severo.products.ProductB2;

public class ConcreteFactory2 implements AbstractFactory{

	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}
