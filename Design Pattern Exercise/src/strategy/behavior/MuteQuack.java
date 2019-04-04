package strategy.behavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public String quack() {
		return "I can't quack";
	}
}
