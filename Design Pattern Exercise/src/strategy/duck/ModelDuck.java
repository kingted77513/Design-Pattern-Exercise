package strategy.duck;

import strategy.behavior.FlyNoWay;
import strategy.behavior.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public String display() {
		return "I'm a model duck";
	}
}
