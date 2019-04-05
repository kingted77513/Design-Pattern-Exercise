package factory.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import factory.ChicagoPizzaFactory;
import factory.NYPizzaFactory;
import factory.Pizza;
import factory.PizzaStore;
import factory.SimplePizzaFactory;

class PizzaStoreTest {
	
	PizzaStore store;

	@Test
	void testOrderSimpleCheesePizza() {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		store = new PizzaStore(factory);
		
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
	
	@Test
	void testOrderChicagoStyleCheesePizza() {
		SimplePizzaFactory factory = new ChicagoPizzaFactory();
		store = new PizzaStore(factory);
		
		String excepted = "Chicago Style Deep Dish Cheese Pizza";
		String pizzaType = "cheese";
		String actual = getPizzaNameByPizzaType(pizzaType);
		assertEquals(excepted, actual);
	}
	
	@Test
	void testOrderNYStyleCheesePizza() {
		SimplePizzaFactory factory = new NYPizzaFactory();
		store = new PizzaStore(factory);
		
		String excepted = "NY Style Sauce and Cheese Pizza";
		String pizzaType = "cheese";
		String actual = getPizzaNameByPizzaType(pizzaType);
		assertEquals(excepted, actual);
	}
}
