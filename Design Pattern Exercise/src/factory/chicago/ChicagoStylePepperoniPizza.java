package factory.chicago;

import factory.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
	public ChicagoStylePepperoniPizza() {
		name = "Chicago Style Pepperoni Pizza";
	}
 
	public String cut() {
		return "Cutting the pizza into square slices";
	}
}
