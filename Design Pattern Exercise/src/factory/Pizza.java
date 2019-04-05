package factory;

abstract public class Pizza {
	protected String name;

	public String getName() {
		return name;
	}

	public String prepare() {
		return "Preparing " + name;
	}

	public String bake() {
		return "Baking " + name;
	}

	public String cut() {
		return "Cutting " + name;
	}

	public String box() {
		return "Boxing " + name;
	}
}

