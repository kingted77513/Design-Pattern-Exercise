package singleton.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import singleton.ChocolateBoiler;

class ChocolateBoilerTest {

	@Test
	void testMakeHotChocolateBySingleBoiler() {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		isInitialStatus(boiler);
		
		boiler.fill();
		afterFillChocolateStatus(boiler);
		
		boiler.boil();
		afterBoilChocolateStatus(boiler);
		
		boiler.drain();
		afterDrainOutStatus(boiler);
	}
	
	private void isInitialStatus(ChocolateBoiler boiler) {
		assertTrue(boiler.isEmpty());
	}
	
	private void afterFillChocolateStatus(ChocolateBoiler boiler) {
		assertFalse(boiler.isEmpty());
		assertFalse(boiler.isBoiled());
	}

	private void afterBoilChocolateStatus(ChocolateBoiler boiler) {
		assertFalse(boiler.isEmpty());
		assertTrue(boiler.isBoiled());
	}
	
	private void afterDrainOutStatus(ChocolateBoiler boiler) {
		assertTrue(boiler.isEmpty());
	}
	
	@Test
	void testBoilChocolateBeforeFillBySingleBoiler() {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		isInitialStatus(boiler);
		
		boiler.boil();
		isInitialStatus(boiler);
	}
	
	@Test
	void testGetSameInstance() {
		ChocolateBoiler boiler1 = ChocolateBoiler.getInstance();
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
		
		assertEquals(boiler1, boiler2);
	}

}
