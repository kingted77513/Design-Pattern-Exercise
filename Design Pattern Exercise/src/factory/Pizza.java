package factory;

import java.util.ArrayList;

abstract public class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> toppings = new ArrayList<String>();

	public String getName() {
		return name;
	}

	public String prepare() {
		StringBuilder message = new StringBuilder();
		message.append("Prepare " + name);
		newLine(message);
		message.append("Tossing dough...");
		newLine(message);
		message.append("Adding sauce...");
		newLine(message);
		addTopping(message);
		return message.toString();
	}
	
	private void newLine(StringBuilder sb) {
		sb.append(System.lineSeparator());
	}

	private void addTopping(StringBuilder message) {
		message.append("Adding toppings: ");
		newLine(message);
		for (String topping : toppings) {
			message.append("   " + topping);
			newLine(message);
		}
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
		message.append("---- " + name + " ----");
		newLine(message);
		message.append("Dough: " + dough);
		newLine(message);
		message.append("Sauce: " + sauce);
		newLine(message);
		addTopping(message);
		return message.toString();
	}
}

