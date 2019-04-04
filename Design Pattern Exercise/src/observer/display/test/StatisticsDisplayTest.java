package observer.display.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import observer.display.StatisticsDisplay;

class StatisticsDisplayTest {

	StatisticsDisplay display;
	
	@BeforeEach
	void setUp() throws Exception {
		display = new StatisticsDisplay();
	}

	@Test
	void testDisplay() {
		String excepted = "Avg/Max/Min temperature = 80.0/82.0/78.0";
		
		float temperature = 80;
		float humidity = 65;
		float pressure = 29f;
		display.update(temperature, humidity, pressure);
		
		temperature = 82;
		display.update(temperature, humidity, pressure);
		
		temperature = 78;
		display.update(temperature, humidity, pressure);
		
		String actual = display.display();
		assertEquals(excepted, actual);
	}
}
