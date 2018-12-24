package br.com.severo.patterns.builder;

import br.com.severo.patterns.meal.Meal;
import br.com.severo.patterns.specialized.ChickenBurger;
import br.com.severo.patterns.specialized.Coke;
import br.com.severo.patterns.specialized.Pepsi;
import br.com.severo.patterns.specialized.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
