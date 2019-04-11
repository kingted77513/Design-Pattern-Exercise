package adapter.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import adapter.TurkeyAdapter;
import adapter.WildTurkey;

class TurkeyAdapterTest {
	
	TurkeyAdapter adapter;

	@BeforeEach
	void setUp() throws Exception {
		WildTurkey turkey = new WildTurkey();
		adapter = new TurkeyAdapter(turkey);
	}

	@Test
	void testQuack() {
		String excepted = "Gobble gobble";
		String actual = adapter.quack();
		assertEquals(excepted, actual);
	}
	
	@Test
	void testFly() {
		String excepted = getTestFlyExcepted();
		String actual = adapter.fly();
		assertEquals(excepted, actual);
	}

	private String getTestFlyExcepted() {
		String excepted = "";
		String fly = "I'm flying a short distance";
		for(int i=0; i < 5; i++) {
			excepted += fly + System.lineSeparator();
		}
		return excepted;
	}

}
