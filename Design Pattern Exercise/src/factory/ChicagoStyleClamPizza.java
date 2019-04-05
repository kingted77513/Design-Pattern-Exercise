package factory;

public class ChicagoStyleClamPizza extends Pizza {
	public ChicagoStyleClamPizza() {
		name = "Chicago Style Clam Pizza";
	}
 
	public String cut() {
		return "Cutting the pizza into square slices";
	}
}
