package strategy.duck;

import strategy.behavior.FlyWithWings;
import strategy.behavior.Quack;

public class RedHeadDuck extends Duck {
	
	public RedHeadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public String display() {
		return "I'm a real Red Headed duck";
	}
}
