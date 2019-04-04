package strategy;

public abstract class Duck {
	public String quack() {
		return "Quack";
	}

	public String swim() {
		return "Swin";
	}
	
	abstract String display();
}
