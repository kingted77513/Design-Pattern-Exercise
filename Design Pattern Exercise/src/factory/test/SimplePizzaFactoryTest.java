package factory.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.Pizza;
import factory.SimplePizzaFactory;

class SimplePizzaFactoryTest {
	
	SimplePizzaFactory factory;

	@BeforeEach
	void setUp() throws Exception {
		factory = new SimplePizzaFactory();
	}

	@Test
	void testOrderCheesePizza() {
		String excepted = "Cheese Pizza";
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
		String excepted = "Pepperoni Pizza";
		String pizzaType = "pepperoni";
		String actual = getPizzaNameByPizzaType(pizzaType);
		assertEquals(excepted, actual);
	}
	
	@Test
	void testOrderClamPizza() {
		String excepted = "Clam Pizza";
		String pizzaType = "clam";
		String actual = getPizzaNameByPizzaType(pizzaType);
		assertEquals(excepted, actual);
	}
	
	@Test
	void testOrderVeggiePizza() {
		String excepted = "Veggie Pizza";
		String pizzaType = "veggie";
		String actual = getPizzaNameByPizzaType(pizzaType);
		assertEquals(excepted, actual);
	}
}