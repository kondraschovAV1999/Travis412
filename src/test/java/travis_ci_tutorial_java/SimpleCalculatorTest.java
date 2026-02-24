package travis_ci_tutorial_java;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}

	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.sub(1, 1), 0);
	}

	@Test
	public void testMult() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.mult(2, 1), 2);
	}

	@Test
	public void testDiv() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.div(2, 1), 2);
	}

	@Test(expected = ArithmeticException.class)
	public void testDivByZero() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.div(2, 0), null);
	}
}
