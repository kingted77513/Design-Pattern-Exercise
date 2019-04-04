package strategy.duck;

import strategy.behavior.FlyRocketPowered;
import strategy.behavior.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyRocketPowered();
		quackBehavior = new Quack();
	}

	public String display() {
		return "I'm a model duck";
	}
}
