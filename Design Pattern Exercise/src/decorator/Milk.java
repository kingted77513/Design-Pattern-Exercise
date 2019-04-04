package decorator;

public class Milk extends Beverage {
	
	public String getDescription() {
		return ", Milk";
	}

	public double cost() {
		return .10;
	}
}
