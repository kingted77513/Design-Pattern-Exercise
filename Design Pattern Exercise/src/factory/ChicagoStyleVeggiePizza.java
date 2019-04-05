package factory;

public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza() {
		name = "Chicago Deep Dish Veggie Pizza";
	}
 
	public String cut() {
		return "Cutting the pizza into square slices";
	}
}
