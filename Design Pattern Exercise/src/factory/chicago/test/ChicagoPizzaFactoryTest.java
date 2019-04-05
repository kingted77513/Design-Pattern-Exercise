package factory.chicago.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.Pizza;
import factory.chicago.ChicagoPizzaFactory;

class ChicagoPizzaFactoryTest {
	
	ChicagoPizzaFactory factory;

	@BeforeEach
	void setUp() throws Exception {
		factory = new ChicagoPizzaFactory();
	}

	@Test
	void testOrderCheesePizza() {
		String excepted = "Chicago Style Deep Dish Cheese Pizza";
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
		String excepted = "Chicago Style Pepperoni Pizza";
		String pizzaType = "pepperoni";
		String actual = getPizzaNameByPizzaType(pizzaType);
		assertEquals(excepted, actual);
	}
	
	@Test
	void testOrderClamPizza() {
		String excepted = "Chicago Style Clam Pizza";
		String pizzaType = "clam";
		String actual = getPizzaNameByPizzaType(pizzaType);
		assertEquals(excepted, actual);
	}
	
	@Test
	void testOrderVeggiePizza() {
		String excepted = "Chicago Deep Dish Veggie Pizza";
		String pizzaType = "veggie";
		String actual = getPizzaNameByPizzaType(pizzaType);
		assertEquals(excepted, actual);
	}
}
