package strategy;

public class RubberDuck extends Duck {
 
	public String display() {
		return "I'm a rubber duck";
	}
	
	@Override
	public String fly() {
		return "I can't fly";
	}
}
