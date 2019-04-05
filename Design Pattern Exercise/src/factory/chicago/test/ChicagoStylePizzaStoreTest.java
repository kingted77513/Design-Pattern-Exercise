package factory.chicago.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.Pizza;
import factory.chicago.ChicagoStylePizzaStore;

class ChicagoStylePizzaStoreTest {
	
	ChicagoStylePizzaStore store;
	
	@BeforeEach
	void setUp() throws Exception {
		store = new ChicagoStylePizzaStore();
	}
	
	@Test
	void testOrderChicagoStyleCheesePizza() {
		String excepted = "Chicago Style Deep Dish Cheese Pizza";
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
