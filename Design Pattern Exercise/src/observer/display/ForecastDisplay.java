package observer.display;

public class ForecastDisplay implements DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;

	public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
		currentPressure = pressure;

		display();
	}

	public String display() {
		String message = "Forecast: ";
		if (currentPressure > lastPressure) {
			message += "Improving weather on the way!";
		} else if (currentPressure == lastPressure) {
			message += "More of the same";
		} else if (currentPressure < lastPressure) {
			message += "Watch out for cooler, rainy weather";
		}
		return message;
	}
}
