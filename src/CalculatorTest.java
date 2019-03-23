import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	private Calculator calculator = new Calculator();
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {
		calculator.add(2);
		calculator.add(3);
		assertEquals(5,calculator.getResult());
	}

	@Test
	void testSubstract() {
		calculator.add(10);
		calculator.substract(3);
		assertEquals(7,calculator.getResult());
	}

	@Test
	void testMultiply() {
		calculator.add(2);
		calculator.multiply(3);
		assertEquals(6,calculator.getResult());
	}

	@Test
	void testDivide() {
		calculator.add(6);
		calculator.divide(2);
		assertEquals(3,calculator.getResult());
	}

}