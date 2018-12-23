package br.com.severo.factory;

import br.com.severo.interfaces.AbstractFactory;
import br.com.severo.interfaces.AbstractProductA;
import br.com.severo.interfaces.AbstractProductB;
import br.com.severo.products.ProductA1;
import br.com.severo.products.ProductB1;

public class ConcreteFactory1 implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
