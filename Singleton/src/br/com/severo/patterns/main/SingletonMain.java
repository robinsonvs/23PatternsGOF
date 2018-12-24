package br.com.severo.patterns.main;

import br.com.severo.patterns.singleton.SingleObject;

public class SingletonMain {

	public static void main(String[] args) {
		
		//illegal construct
		//Compile Time Error: The constructor SingleObject() is not visible 
		//SingleObject object = new SingleObject();
		
		//get the only object available
		SingleObject object = SingleObject.getInstance();
		
		object.showMessage();
	}
}
