package templatemethod;

public class Tea extends CaffeineBeverage{

	@Override
	public String brew() {
		return "Steeping the tea";
	}

	@Override
	public String addCondiments() {
		return "Adding Lemon";
	}
}
