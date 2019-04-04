package strategy;

public class DecoyDuck extends Duck {
	
	public String display() {
		return "I'm a duck Decoy";
	}
	
	@Override
	public String quack() {
		return "I can't quack";
	}
	
	@Override
	public String fly() {
		return "I can't fly";
	}
}
