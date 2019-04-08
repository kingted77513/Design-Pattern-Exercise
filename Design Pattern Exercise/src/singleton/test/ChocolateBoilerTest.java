package singleton.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import singleton.ChocolateBoiler;

class ChocolateBoilerTest {

	@Test
	void testMakeHotChocolateBySingleBoiler() {
		ChocolateBoiler boiler = new ChocolateBoiler();
		isInitialStatus(boiler);
		
		boiler.fill();
		afterFillChocolateStatus(boiler);
		
		boiler.boil();
		afterBoilChocolateStatus(boiler);
		
		boiler.drain();
		afterDrainOutStatus(boiler);
	}

	private void afterDrainOutStatus(ChocolateBoiler boiler) {
		assertTrue(boiler.isEmpty());
		assertTrue(boiler.isBoiled());
	}

	private void afterBoilChocolateStatus(ChocolateBoiler boiler) {
		assertFalse(boiler.isEmpty());
		assertTrue(boiler.isBoiled());
	}

	private void afterFillChocolateStatus(ChocolateBoiler boiler) {
		assertFalse(boiler.isEmpty());
		assertFalse(boiler.isBoiled());
	}

	private void isInitialStatus(ChocolateBoiler boiler) {
		assertTrue(boiler.isEmpty());
		assertFalse(boiler.isBoiled());
	}
	
	@Test
	void testBoilChocolateBeforeFillBySingleBoiler() {
		ChocolateBoiler boiler = new ChocolateBoiler();
		isInitialStatus(boiler);
		
		boiler.boil();
		isInitialStatus(boiler);
	}

}
