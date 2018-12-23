package br.com.severo.client;

import br.com.severo.interfaces.AbstractFactory;
import br.com.severo.interfaces.AbstractProductA;
import br.com.severo.interfaces.AbstractProductB;

public class Client {
	
	private AbstractProductA productA;
	private AbstractProductB productB;
	
	public Client(AbstractFactory factory){
		productA = factory.createProductA();
		productB = factory.createProductB();
	}
	
	public void execute() {
		productB.interact(productA);
	}

}
