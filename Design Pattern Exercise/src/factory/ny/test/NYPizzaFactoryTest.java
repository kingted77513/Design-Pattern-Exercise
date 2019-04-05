package factory.ny.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.Pizza;
import factory.ny.NYPizzaFactory;

class NYPizzaFactoryTest {
	
	NYPizzaFactory factory;

	@BeforeEach
	void setUp() throws Exception {
		factory = new NYPizzaFactory();
	}

	@Test
	void testOrderCheesePizza() {
		String excepted = "NY Style Sauce and Cheese Pizza";
		String pizzaType = "cheese";
		String actual = getPizzaNameByPizzaType(pizzaType);
		assertEquals(excepted, actual);
	}

	private String getPizzaNameByPizzaType(String pizzaType) {
		Pizza pizza = factory.createPizza(pizzaType);
		String actual = pizza.getName();
		return actual;
	}
	
	@Test
	void testOrderPepperoniPizza() {
		String excepted = "NY Style Pepperoni Pizza";
		String pizzaType = "pepperoni";
		String actual = getPizzaNameByPizzaType(pizzaType);
		assertEquals(excepted, actual);
	}
	
	@Test
	void testOrderClamPizza() {
		String excepted = "NY Style Clam Pizza";
		String pizzaType = "clam";
		String actual = getPizzaNameByPizzaType(pizzaType);
		assertEquals(excepted, actual);
	}
	
	@Test
	void testOrderVeggiePizza() {
		String excepted = "NY Style Veggie Pizza";
		String pizzaType = "veggie";
		String actual = getPizzaNameByPizzaType(pizzaType);
		assertEquals(excepted, actual);
	}
}
