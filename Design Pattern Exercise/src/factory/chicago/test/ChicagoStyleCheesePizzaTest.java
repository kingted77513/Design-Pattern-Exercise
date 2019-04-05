package factory.chicago.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.PizzaIngredientFactory;
import factory.chicago.ChicagoPizzaIngredientFactory;
import factory.chicago.ChicagoStyleCheesePizza;

class ChicagoStyleCheesePizzaTest {
	
	ChicagoStyleCheesePizza pizza;

	@BeforeEach
	void setUp() throws Exception {
		PizzaIngredientFactory ingredientFactory =
				new ChicagoPizzaIngredientFactory();
		pizza = new ChicagoStyleCheesePizza(ingredientFactory);
	}
	
	@Test
	void testGetPizzaInformation() {
		String excepted = "Chicago Style Deep Dish Cheese Pizza";
		String actual = pizza.getName();
		assertEquals(excepted, actual);
	}

	@Test
	void testCookPizza() {
		String excepted = "Prepared Chicago Style Deep Dish Cheese Pizza";
		String actual = pizza.prepare();
		assertEquals(excepted, actual);
		
		excepted = "Bake for 25 minutes at 350";
		actual = pizza.bake();
		assertEquals(excepted, actual);
		
		excepted = "Cutting the pizza into square slices";
		actual = pizza.cut();
		assertEquals(excepted, actual);
		
		excepted = "Place pizza in official PizzaStore box";
		actual = pizza.box();
		assertEquals(excepted, actual);
		
		excepted = getPizzaDescription();
		actual = pizza.getDescription();
		assertEquals(excepted, actual);
	}
	
	private String getPizzaDescription() {
		StringBuilder sb = new StringBuilder();
		sb.append("---- Chicago Style Deep Dish Cheese Pizza ----");
		sb.append(System.lineSeparator());
		sb.append("Dough: ThickCrust style extra thick crust dough");
		sb.append(System.lineSeparator());
		sb.append("Sauce: Tomato sauce with plum tomatoes");
		sb.append(System.lineSeparator());
		sb.append("Cheese: Shredded Mozzarella");
		sb.append(System.lineSeparator());
		
		String excepted = sb.toString();
		return excepted;
	}
}
