package strategy.duck;

import strategy.behavior.FlyNoWay;
import strategy.behavior.MuteQuack;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	
	public String display() {
		return "I'm a duck Decoy";
	}
}
