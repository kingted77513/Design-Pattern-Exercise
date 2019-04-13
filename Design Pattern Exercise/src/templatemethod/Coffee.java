package templatemethod;

public class Coffee {
 
	void prepareRecipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}
 
	public String boilWater() {
		return "Boiling water";
	}
 
	public String brewCoffeeGrinds() {
		return "Dripping Coffee through filter";
	}
 
	public String pourInCup() {
		return "Pouring into cup";
	}
 
	public String addSugarAndMilk() {
		return "Adding Sugar and Milk";
	}
}
