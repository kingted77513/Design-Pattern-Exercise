package observer.display.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import observer.display.ForecastDisplay;

class ForecastDisplayTest {

	ForecastDisplay display;
	
	@BeforeEach
	void setUp() throws Exception {
		display = new ForecastDisplay();
	}

	@Test
	void testDisplayOfImprovingWeather() {
		String excepted = "Forecast: Improving weather on the way!";
		
		float temperature = 80;
		float humidity = 65;
		float pressure = 29f;
		display.update(temperature, humidity, pressure);
		
		pressure = 30.4f;
		display.update(temperature, humidity, pressure);
		
		String actual = display.display();
		assertEquals(excepted, actual);
	}
	
	@Test
	void testDisplayOfSameWeather() {
		String excepted = "Forecast: More of the same";
		
		float temperature = 80;
		float humidity = 65;
		float pressure = 29f;
		display.update(temperature, humidity, pressure);
		
		pressure = 29f;
		display.update(temperature, humidity, pressure);
		
		String actual = display.display();
		assertEquals(excepted, actual);
	}
	
	@Test
	void testDisplayOfCoolerWeather() {
		String excepted = "Forecast: Watch out for cooler, rainy weather";
		
		float temperature = 80;
		float humidity = 65;
		float pressure = 30.4f;
		display.update(temperature, humidity, pressure);
		
		pressure = 29f;
		display.update(temperature, humidity, pressure);
		
		String actual = display.display();
		assertEquals(excepted, actual);
	}

}
