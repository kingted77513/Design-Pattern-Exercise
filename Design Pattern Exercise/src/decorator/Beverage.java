package decorator;

public abstract class Beverage {
	String description = "Unknown Beverage";
	private Milk milk;
	private Mocha mocha;
	private Soy soy;
	private Whip whip;
  
	public String getDescription() {
		String fullDescription = description;
		if (hasMilk()) {
			fullDescription += milk.getDescription();
		}
		if (hasMocha()) {
			fullDescription += mocha.getDescription();
		}
		if (hasSoy()) {
			fullDescription += soy.getDescription();
		}
		if (hasWhip()) {
			fullDescription += whip.getDescription();
		}
		return fullDescription;
	}
 
	public double cost() {
		double cost = 0.0;
		if (hasMilk()) {
			cost += milk.cost();
		}
		if (hasMocha()) {
			cost += mocha.cost();
		}
		if (hasSoy()) {
			cost += soy.cost();
		}
		if (hasWhip()) {
			cost += whip.cost();
		}
		return cost;
	}

	public boolean hasMilk() {
		return (milk != null);
	}

	public void setMilk() {
		milk = new Milk();
	}
	
	public boolean hasMocha() {
		return (mocha != null);
	}

	public void setMocha() {
		mocha = new Mocha();
	}
	
	public boolean hasSoy() {
		return (soy != null);
	}

	public void setSoy() {
		soy = new Soy();
	}
	
	public boolean hasWhip() {
		return (whip != null);
	}

	public void setWhip() {
		whip = new Whip();
	}
}
