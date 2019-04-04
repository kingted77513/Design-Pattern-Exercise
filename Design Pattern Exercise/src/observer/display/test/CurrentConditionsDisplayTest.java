package observer.display.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import observer.WeatherData;
import observer.display.CurrentConditionsDisplay;

class CurrentConditionsDisplayTest {

	WeatherData weatherData;
	CurrentConditionsDisplay display;
	
	@BeforeEach
	void setUp() throws Exception {
		weatherData = new WeatherData();
		display = new CurrentConditionsDisplay(weatherData);
	}

	@Test
	void testDisplay() {
		String excepted = "Current conditions: 80.0F degrees and 65.0% humidity";
		
		float temperature = 80;
		float humidity = 65;
		float pressure = 30.4f;
		weatherData.setMeasurements(temperature, humidity, pressure);
		weatherData.measurementsChanged();
		
		String actual = display.display();
		assertEquals(excepted, actual);
	}

}
