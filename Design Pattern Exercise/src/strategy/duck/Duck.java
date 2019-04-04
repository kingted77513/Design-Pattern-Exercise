package strategy.duck;

import strategy.behavior.FlyBehavior;
import strategy.behavior.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	abstract String display();
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
	public String fly() {
		return flyBehavior.fly();
	}

	public String quack() {
		return quackBehavior.quack();
	}

	public String swim() {
		return "Swin";
	}
}
