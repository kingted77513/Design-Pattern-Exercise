package observer.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import observer.WeatherData;

class WeatherDataTest {
	WeatherData data;

	@BeforeEach
	void setUp() throws Exception {
		data = new WeatherData();
	}

	@Test
	void testGetChangedData() {
		float exptectedTemperature = 80;
		float exptectedHumidity = 65;
		float exptectedPressure = 30.4f;
		
		data.setMeasurements(exptectedTemperature, exptectedHumidity
				, exptectedPressure);
		
		float actualTemperature = data.getTemperature();
		float actualHumidity = data.getHumidity();
		float actualPressure = data.getPressure();
		
		assertEquals(exptectedTemperature, actualTemperature);
		assertEquals(exptectedHumidity, actualHumidity);
		assertEquals(exptectedPressure, actualPressure);
	}

}
