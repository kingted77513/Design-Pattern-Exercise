package factory;

import java.util.ArrayList;

abstract public class Pizza {
	protected String name;
	protected ArrayList<String> toppings = new ArrayList<String>();

	public String getName() {
		return name;
	}

	public String prepare() {
		StringBuilder sb = new StringBuilder();
		sb.append("Prepare " + name);
		newLine(sb);
		sb.append("Tossing dough...");
		newLine(sb);
		sb.append("Adding sauce...");
		newLine(sb);
		addTopping(sb);
		return sb.toString();
	}
	
	private void newLine(StringBuilder sb) {
		sb.append(System.lineSeparator());
	}

	private void addTopping(StringBuilder sb) {
		sb.append("Adding toppings: ");
		newLine(sb);
		for (String topping : toppings) {
			sb.append("   " + topping);
			newLine(sb);
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
}

