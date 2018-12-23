package br.com.severo.main;

import br.com.severo.client.Client;
import br.com.severo.factory.ConcreteFactory1;
import br.com.severo.factory.ConcreteFactory2;
import br.com.severo.interfaces.AbstractFactory;

public class Main {
	
	public static void main(String[] args) {
		
		AbstractFactory factory1 = new ConcreteFactory1();
		Client client1 = new Client(factory1);
		client1.execute();
		
		AbstractFactory factory2 = new ConcreteFactory2();
		Client client2 = new Client(factory2);
		client2.execute();
	}

}
