package factory.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.Pizza;
import factory.ny.NYStylePizzaStore;

class NYStylePizzaStoreTest {
	
	NYStylePizzaStore store;
	
	@BeforeEach
	void setUp() throws Exception {
		store = new NYStylePizzaStore();
	}
	
	@Test
	void testOrderChicagoStyleCheesePizza() {
		String excepted = "NY Style Sauce and Cheese Pizza";
		String pizzaType = "cheese";
		String actual = getPizzaNameByPizzaType(pizzaType);
		assertEquals(excepted, actual);
	}
	
	private String getPizzaNameByPizzaType(String pizzaType) {
		Pizza pizza = store.orderPizza(pizzaType);
		String actual = pizza.getName();
		return actual;
	}
}
