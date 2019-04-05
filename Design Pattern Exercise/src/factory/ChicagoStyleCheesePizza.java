package factory;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() { 
		name = "Chicago Style Deep Dish Cheese Pizza";
	}
 
	public String cut() {
		return "Cutting the pizza into square slices";
	}
}
