import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestApp {

	

	@Test
	public void addMethodTest() {
		Caclulator c = new Caclulator();
		int result = c.add(20, 30);
		assertEquals(50, result);
	}
}
