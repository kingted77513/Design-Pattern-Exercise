package factory;

public class ChicagoStylePepperoniPizza extends Pizza {
	public ChicagoStylePepperoniPizza() {
		name = "Chicago Style Pepperoni Pizza";
	}
 
	public String cut() {
		return "Cutting the pizza into square slices";
	}
}
