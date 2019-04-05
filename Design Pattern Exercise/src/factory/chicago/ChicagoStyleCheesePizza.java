package factory.chicago;

import factory.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() { 
		name = "Chicago Style Deep Dish Cheese Pizza";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
 
	public String cut() {
		return "Cutting the pizza into square slices";
	}
}
