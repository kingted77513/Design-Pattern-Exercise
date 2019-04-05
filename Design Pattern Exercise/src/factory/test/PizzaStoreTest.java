package factory.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.Pizza;
import factory.PizzaStore;
import factory.SimplePizzaFactory;

class PizzaStoreTest {
	
	PizzaStore store;

	@BeforeEach
	void setUp() throws Exception {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		store = new PizzaStore(factory);
	}

	@Test
	void testOrderCheesePizza() {
		String excepted = "Cheese Pizza";
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
