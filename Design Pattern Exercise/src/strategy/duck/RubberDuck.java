package strategy.duck;

import strategy.behavior.FlyNoWay;
import strategy.behavior.Squeak;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
	public String display() {
		return "I'm a rubber duck";
	}
}
