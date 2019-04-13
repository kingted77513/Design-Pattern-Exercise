package templatemethod;

public abstract class CaffeineBeverage {
  
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
 
	abstract String brew();
  
	abstract String addCondiments();
 
	public String boilWater() {
		return "Boiling water";
	}
  
	public String pourInCup() {
		return "Pouring into cup";
	}
}
