package strategy;

public abstract class Duck {
	
	abstract String display();
	
	public String quack() {
		return "Quack";
	}

	public String swim() {
		return "Swin";
	}
	
	public String fly() {
		return "Fly";
	}
}
