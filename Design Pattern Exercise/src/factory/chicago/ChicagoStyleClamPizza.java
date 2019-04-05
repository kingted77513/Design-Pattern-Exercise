package factory.chicago;

import factory.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
	public ChicagoStyleClamPizza() {
		name = "Chicago Style Clam Pizza";
	}
 
	public String cut() {
		return "Cutting the pizza into square slices";
	}
}
