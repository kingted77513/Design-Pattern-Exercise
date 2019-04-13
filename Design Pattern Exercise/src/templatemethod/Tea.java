package templatemethod;

public class Tea {
 
	void prepareRecipe() {
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
	}
 
	public String boilWater() {
		return "Boiling water";
	}
 
	public String steepTeaBag() {
		return "Steeping the tea";
	}
 
	public String addLemon() {
		return "Adding Lemon";
	}
 
	public String pourInCup() {
		return "Pouring into cup";
	}
}
