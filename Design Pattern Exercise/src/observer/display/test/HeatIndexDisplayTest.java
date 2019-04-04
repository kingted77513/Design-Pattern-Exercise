package observer.display.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import observer.WeatherData;
import observer.display.HeatIndexDisplay;

class HeatIndexDisplayTest {

	WeatherData weatherData;
	HeatIndexDisplay display;
	
	@BeforeEach
	void setUp() throws Exception {
		weatherData = new WeatherData();
		display = new HeatIndexDisplay(weatherData);
	}

	@Test
	void testDisplay() {
		String excepted = "Heat index is 82.95535";
		
		float temperature = 80;
		float humidity = 65;
		float pressure = 30.4f;
		weatherData.setMeasurements(temperature, humidity, pressure);
		weatherData.measurementsChanged();
		
		String actual = display.display();
		assertEquals(excepted, actual);
	}

}
