package templatemethod;

public class Coffee extends CaffeineBeverage{

	@Override
	public String brew() {
		return "Dripping Coffee through filter";
	}

	@Override
	public String addCondiments() {
		return "Adding Sugar and Milk";
	}
}
