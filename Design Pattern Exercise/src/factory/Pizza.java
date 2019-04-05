package factory;

import factory.ingredient.cheese.Cheese;
import factory.ingredient.clams.Clams;
import factory.ingredient.dough.Dough;
import factory.ingredient.pepperoni.Pepperoni;
import factory.ingredient.sauce.Sauce;

abstract public class Pizza {
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Cheese cheese;
	protected Clams clam;
	protected Pepperoni pepperoni;
	
	public String getName() {
		return name;
	}

	abstract public String prepare();
	
	private void newLine(StringBuilder sb) {
		sb.append(System.lineSeparator());
	}

	public String bake() {
		return "Bake for 25 minutes at 350";
	}

	public String cut() {
		return "Cut the pizza into diagonal slices";
	}

	public String box() {
		return "Place pizza in official PizzaStore box";
	}
	
	public String getDescription() {
		StringBuilder message = new StringBuilder();
		addNameInformation(message);
		addDoughInformation(message);
		addSauceInformation(message);
		addCheeseInformation(message);
		addClamInformation(message);
		addPepperoniInformation(message);
		return message.toString();
	}

	private StringBuilder addNameInformation(StringBuilder message) {	
		message.append("---- " + name + " ----");
		newLine(message);
		return message;
	}
	
	private void addDoughInformation(StringBuilder message) {
		message.append("Dough: " + dough.getDescription());
		newLine(message);
	}
	
	private void addSauceInformation(StringBuilder message) {
		message.append("Sauce: " + sauce.getDescription());
		newLine(message);
	}
	
	private void addCheeseInformation(StringBuilder message) {
		if (cheese != null) {
			message.append("Cheese: " + cheese.getDescription());
			newLine(message);
		}
	}

	private void addClamInformation(StringBuilder message) {
		if (clam != null) {
			message.append("Clams: " + clam.getDescription());
			newLine(message);
		}
	}
	
	private void addPepperoniInformation(StringBuilder message) {
		if (pepperoni != null) {
			message.append("Pepperoni: " + pepperoni.getDescription());
			newLine(message);
		}
	}
}

