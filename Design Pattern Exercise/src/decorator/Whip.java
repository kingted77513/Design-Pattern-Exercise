package decorator;
 
public class Whip extends Beverage {
 
	public String getDescription() {
		return ", Whip";
	}
 
	public double cost() {
		return .10;
	}
}
